package me.nixing.xgen.conf.manager;

import java.util.HashMap;
import java.util.Map;

import me.nixing.xgen.conf.providers.GenConfProvider;
import me.nixing.xgen.conf.providers.ModuleConfProvider;
import me.nixing.xgen.conf.vo.GenConfModel;
import me.nixing.xgen.conf.vo.ModuleConfModel;
import me.nixing.xgen.conf.vo.NeedGenModel;
import me.nixing.xgen.conf.vo.ThemeModel;
/**
 * 
 * 解析、缓存、管理配置数据
 * @author binghx
 * @since 1.0.0
 *
 */
public class ConfManager {
	/**
	 * 懒汉
	 */
	private static ConfManager confManager = null;
	
	/**
	 * 缓存配置数据
	 */
	private GenConfModel confModel = new GenConfModel();
	private Map<String,ModuleConfModel> moduleConfs = new HashMap<>();
	
	private GenConfProvider provider = null;
	
	private ConfManager(GenConfProvider provider) {
		this.provider = provider;
		readConf(this.provider);
	}
	
	/**
	 * 提供全局唯一访问点
	 * @return
	 */
	public static ConfManager getInstance(GenConfProvider provider){
		if(confManager == null){
			confManager = new ConfManager(provider);
		}
		
		return confManager;
	}

	public GenConfModel getConfModel() {
		return confModel;
	}

	public Map<String, ModuleConfModel> getModuleConfs() {
		return moduleConfs;
	}

	private void readConf(GenConfProvider confProvider){
		readGenConf(confProvider);
		readModulesConf();
	}
	
	private void readGenConf(GenConfProvider provider){
		confModel.setNeedGens(provider.getNeedGenModels());
		confModel.setThemes(provider.getThemeModels());
		confModel.setConstants(provider.getConstants());
	}
	
	private void readModulesConf(){
		for (NeedGenModel needGenModel : confModel.getNeedGens()) {
			ModuleConfModel moduleConfModel = readOneModuleConf(needGenModel);
			moduleConfs.put(moduleConfModel.getModuleId(), moduleConfModel);
		}
	}
	
	private ModuleConfModel readOneModuleConf(NeedGenModel needGenModel){
		ModuleConfProvider moduleConfPriver = getModuleConfPriver(needGenModel);
		ModuleConfModel moduleConfModel = moduleConfPriver.getBaseModuleConfModel();
		moduleConfModel.setModuleId(needGenModel.getNeedGenId());
		moduleConfModel.setUseThemeId(needGenModel.getThemeId());
		moduleConfModel.setNeedGenTypes(moduleConfPriver.getNeedGenTypes());
		moduleConfModel.setExtendConfs(moduleConfPriver.getExtendConfs());
		return moduleConfModel;
	}

	private ModuleConfProvider getModuleConfPriver(NeedGenModel needGenModel) {
		String moduleProviderClassName = getModuleConfProviderClassName(needGenModel);
		ModuleConfProvider moduleConfPriver = newInstanceOfModuleConfProvider(moduleProviderClassName);
		return moduleConfPriver;
	}


	private String getModuleConfProviderClassName(NeedGenModel needGenModel) {
		String moduleProviderClassName = confModel.getThemeById(needGenModel.getThemeId()).getProviders().get(needGenModel.getProvider());
		return moduleProviderClassName;
	}
	
	private ModuleConfProvider newInstanceOfModuleConfProvider(String moduleProviderClassName) {
		ModuleConfProvider moduleConfPriver = null; 
		try {
			try {
				moduleConfPriver = (ModuleConfProvider) Class.forName(moduleProviderClassName).newInstance();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return moduleConfPriver;
	}
}
