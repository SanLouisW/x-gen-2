package me.nixing.xgen.conf.manager;

import java.util.HashMap;
import java.util.Map;

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
	private ConfManager() {
		readConf();
	}
	
	/**
	 * 提供全局唯一访问点
	 * @return
	 */
	public static ConfManager getInstance(){
		if(confManager == null){
			confManager = new ConfManager();
		}
		
		return confManager;
	}
	
	
	
	public ConfManager getConfManager() {
		return confManager;
	}

	public void setConfManager(ConfManager confManager) {
		this.confManager = confManager;
	}

	public GenConfModel getConfModel() {
		return confModel;
	}

	public Map<String, ModuleConfModel> getModuleConfs() {
		return moduleConfs;
	}

	private void readConf(){
		//解析配置文件
		System.out.println("解析配置文件");
		//缓存配置数据
		System.out.println("缓存配置数据");
	}
	
}
