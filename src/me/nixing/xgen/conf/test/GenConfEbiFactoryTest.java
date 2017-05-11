package me.nixing.xgen.conf.test;

import static org.junit.Assert.*;

import org.junit.Test;

import me.nixing.xgen.conf.GenConfEbi;
import me.nixing.xgen.conf.GenConfEbiFactory;

public class GenConfEbiFactoryTest {

	@Test
	public void testCreateGenConfEbi() {
		//!GenConfEbi genConfEbi = new GenConfEbo(); //GenConfEbo在包外不可见
		GenConfEbi genConfEbi = GenConfEbiFactory.createGenConfEbi();
		genConfEbi.getGenConf();
	}

}
