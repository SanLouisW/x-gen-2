package me.nixing.xgen.conf.manager;

import java.util.HashMap;
import java.util.Map;

import me.nixing.xgen.conf.providers.GenConfProvider;
import me.nixing.xgen.conf.vo.GenConfModel;
import me.nixing.xgen.conf.vo.ModuleConfModel;
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
		//解析配置文件
		System.out.println("解析配置文件");
		confProvider.getNeedGenModels();
		confProvider.getThemeModels();
		confProvider.getConstants();
		//缓存配置数据
		System.out.println("缓存配置数据");
	}
	
}
