package me.nixing.xgen.conf.providers;

import java.util.List;
import java.util.Map;

import me.nixing.xgen.conf.vo.ExtendConfModel;
import me.nixing.xgen.conf.vo.ModuleConfModel;
import me.nixing.xgen.conf.vo.NeedGenTypeModel;

public interface ModuleConfProvider {
	
	ModuleConfModel getBaseModuleConfModel();

	Map<String, NeedGenTypeModel> getNeedGenTypes();

	List<ExtendConfModel> getExtendConfs();

}
