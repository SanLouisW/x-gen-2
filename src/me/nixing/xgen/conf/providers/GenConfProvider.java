package me.nixing.xgen.conf.providers;

import java.util.List;
import java.util.Map;

import me.nixing.xgen.conf.vo.NeedGenModel;
import me.nixing.xgen.conf.vo.ThemeModel;

public interface GenConfProvider {
	public List<NeedGenModel> getNeedGenModels();
	public List<ThemeModel> getThemeModels();
	public Map<String,String> getConstants();
}
