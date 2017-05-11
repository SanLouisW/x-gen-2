package me.nixing.xgen.conf.vo;

import java.util.HashMap;
import java.util.Map;
/**
 * 需要生成模块的model
 * @author binghx
 * @since 1.0.0
 *
 */
public class NeedGenModel {
	/**
	 * 需要生成模块的id
	 */
	private String needGenId;
	/**
	 * 需要生成模块依赖的解析类
	 */
	private String provider;
	/**
	 * 生成模块依据的theme
	 */
	private String themeId;
	/**
	 * 需要生成模块的参数集合
	 */
	private Map<String,String> params = new HashMap<>();
	public String getNeedGenId() {
		return needGenId;
	}
	public void setNeedGenId(String needGenId) {
		this.needGenId = needGenId;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getThemeId() {
		return themeId;
	}
	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}
	public Map<String, String> getParams() {
		return params;
	}
	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
}
