package me.nixing.xgen.conf.vo;

import java.util.HashMap;
import java.util.Map;
/**
 * 主题Model
 * @author bingh
 * @since 1.0.0
 */
public class ThemeModel {
	/**
	 * 主题的id
	 */
	private String themeId;
	/**
	 * 主题所在的根目录
	 */
	private String location;
	/**
	 * 生成类型map key:id;value:GenTypeModel
	 */
	private Map<String,GenTypeModel> genTypes = new HashMap<>();
	/**
	 * 生成输出类型map key:id;value:type
	 */
	private Map<String,String> genOutTypes = new HashMap<>();
	/**
	 * provider map key:id;value:type
	 */
	private Map<String ,String> providers = new HashMap<>();
	
	public String getThemeId() {
		return themeId;
	}
	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Map<String, GenTypeModel> getGenTypes() {
		return genTypes;
	}
	public void setGenTypes(Map<String, GenTypeModel> genTypes) {
		this.genTypes = genTypes;
	}
	public Map<String, String> getGenOutTypes() {
		return genOutTypes;
	}
	public void setGenOutTypes(Map<String, String> genOutTypes) {
		this.genOutTypes = genOutTypes;
	}
	public Map<String, String> getProviders() {
		return providers;
	}
	public void setProviders(Map<String, String> providers) {
		this.providers = providers;
	}
	
}
