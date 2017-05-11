package me.nixing.xgen.conf;

import java.util.Map;

import me.nixing.xgen.conf.vo.GenConfModel;
import me.nixing.xgen.conf.vo.ModuleConfModel;
/**
 * x-gen框架配置管理模块对外提供的程序接口
 * @author binghx
 * @since 1.0.0
 *
 */
public interface GenConfEbi {
	/**
	 * 获取x-gen核心系统运行所需的配置数据
	 * @return GenConfModel
	 */
	public GenConfModel getGenConf();
	
	/**
	 * 获取x-gen要生成的各个模块的配置数据
	 * @return 各个模块的配置数据的map key:模块的id value:模块的配置model
	 */
	public Map<String,ModuleConfModel> getModuleConfs();
}
