package me.nixing.xgen.conf.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * 要生成模块的配置数据model
 * @author binghx
 * @since 1.0.0
 *
 */
public class ModuleConfModel {
	/**
	 * 需要生成的模块的id
	 */
	private String moduleId;
	/**
	 * 生成定义模块需要使用的主题
	 */
	private String useThemeId;
	/**
	 * 生成模块的生成器类型
	 */
	private Map<String,NeedGenTypeModel> needGenTypes = new HashMap<>();
	/**
	 * 模块的扩展数据
	 */
	private List<ExtendConfModel> extendConfs = new ArrayList<>();
	
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getUseThemeId() {
		return useThemeId;
	}
	public void setUseThemeId(String useThemeId) {
		this.useThemeId = useThemeId;
	}	
	public Map<String, NeedGenTypeModel> getNeedGenTypes() {
		return needGenTypes;
	}
	public void setNeedGenTypes(Map<String, NeedGenTypeModel> needGenTypes) {
		this.needGenTypes = needGenTypes;
	}
	public List<ExtendConfModel> getExtendConfs() {
		return extendConfs;
	}
	public void setExtendConfs(List<ExtendConfModel> extendConfs) {
		this.extendConfs = extendConfs;
	}
	
}
