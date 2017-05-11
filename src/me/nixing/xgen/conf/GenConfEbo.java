package me.nixing.xgen.conf;

import java.util.Map;

import me.nixing.xgen.conf.manager.ConfManager;
import me.nixing.xgen.conf.vo.GenConfModel;
import me.nixing.xgen.conf.vo.ModuleConfModel;
/**
 * GenConfEbi实现类
 * @author binghx
 * @since 1.0.0
 *
 */
class GenConfEbo implements GenConfEbi {
	/**
	 * 饿汉
	 */
	private static GenConfEbo genConfEbo = new GenConfEbo();
	
	private GenConfEbo() {
	}
	
	/**
	 * 提供全局唯一访问点
	 * @return
	 */
	public static GenConfEbo getInstance(){
		return genConfEbo;
	}
	
	@Override
	public GenConfModel getGenConf() {
		System.out.println("getGenConf");
		return ConfManager.getInstance().getConfModel();
	}
	
	@Override
	public Map<String, ModuleConfModel> getModuleConfs() {
		System.out.println("getModuleConfs");
		return ConfManager.getInstance().getModuleConfs();
	}

}
