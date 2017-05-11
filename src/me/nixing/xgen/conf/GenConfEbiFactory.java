package me.nixing.xgen.conf;
/**
 * 实现一个静态工厂
 * @author binghx
 * @since 1.0.0
 *
 */
public class GenConfEbiFactory {
	/**
	 * 私有化构造，防止客户端程序员误创建工厂对象
	 */
	private GenConfEbiFactory() {
	}
	
	public static GenConfEbi createGenConfEbi(){
		return GenConfEbo.getInstance();
	}
	
}
