package me.nixing.xgen.conf.vo;

import java.util.List;

/**
 * 
 * 模块内部配置数据的model
 * @author binghx
 * @since 1.0.0
 *
 */
public class ExtendConfModel {
	/**
	 * 模块内部配置数据的id
	 */
	private String id;
	/**
	 * 数据是否为单个
	 */
	private boolean isSingle;
	/**
	 * 单个数据的值
	 */
	private String value;
	/**
	 * 多个数据的存储list
	 */
	private List<String> values;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isSingle() {
		return isSingle;
	}
	public void setSingle(boolean isSingle) {
		this.isSingle = isSingle;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<String> getValues() {
		return values;
	}
	public void setValues(List<String> values) {
		this.values = values;
	}
	
}
