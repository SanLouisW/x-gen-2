package me.nixing.xgen.conf;

import me.nixing.xgen.conf.providers.GenConfProvider;

/**
 * 实现一个静态工厂
 * @author binghx
 * @since 1.0.0
 *
 */
public class GenConfEbiFactory {
	
	private static GenConfProvider defaultConfProvider = null;
	/**
	 * 私有化构造，防止客户端程序员误创建工厂对象
	 */
	private GenConfEbiFactory() {
	}
	
	public static GenConfEbi createGenConfEbi(){
		return GenConfEbo.getInstance(defaultConfProvider);
	}
	
	public static GenConfEbi createGenConfEbi(GenConfProvider provider){
		return GenConfEbo.getInstance(provider);
	}
}
