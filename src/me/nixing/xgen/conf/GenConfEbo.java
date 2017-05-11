package me.nixing.xgen.conf;

import java.util.Map;

import me.nixing.xgen.conf.vo.GenConfModel;
import me.nixing.xgen.conf.vo.ModuleConfModel;
/**
 * GenConfEbi实现类
 * @author binghx
 * @since 1.0.0
 *
 */
class GenConfEbo implements GenConfEbi {
	
	@Override
	public GenConfModel getGenConf() {
		System.out.println("getGenConf");
		return null;
	}
	
	@Override
	public Map<String, ModuleConfModel> getModuleConfs() {
		System.out.println("getModuleConfs");
		return null;
	}

}
