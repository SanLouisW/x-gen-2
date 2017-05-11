package me.nixing.xgen.conf.vo;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author binghx
 * @since 1.0.0
 *
 */
public class GenTypeModel {
	/**
	 * genTypeModel id
	 */
	private String genTypeId;
	/**
	 * genTypeModel type(fullclassname)
	 */
	private String type;
	/**
	 * 参数map key:id;value:value
	 */
	private Map<String,String> params = new HashMap<>();

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
	
}
