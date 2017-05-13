package me.nixing.xgen.conf.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * x-gen核心框架配置的数据model
 * @author binghx
 * @since 1.0.0
 *
 */
public class GenConfModel {
	/**
	 * 用户需要生成的模块model
	 */
	private List<NeedGenModel> needGens = new ArrayList<>();
	/**
	 * 注册的外部主题model
	 */
	private List<ThemeModel> themes = new ArrayList<>();
	/**
	 * 通用常量
	 */
	private Map<String,String> constants = new HashMap<>();
	
	public ThemeModel getThemeById(String id){
		for (ThemeModel theme : this.themes) {
			if(theme.getThemeId().equals(id)){
				return theme;
			}
		}
		return null;
	}
	
	public List<NeedGenModel> getNeedGens() {
		return needGens;
	}
	public void setNeedGens(List<NeedGenModel> needGens) {
		this.needGens = needGens;
	}
	public List<ThemeModel> getThemes() {
		return themes;
	}
	public void setThemes(List<ThemeModel> themes) {
		this.themes = themes;
	}
	public Map<String, String> getConstants() {
		return constants;
	}
	public void setConstants(Map<String, String> constants) {
		this.constants = constants;
	}
	
}
