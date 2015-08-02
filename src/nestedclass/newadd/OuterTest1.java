package nestedclass.newadd;

/**
 * 一个简单的内部类，就是一个普通类嵌套在内部。
 * @author Chengxq
 *
 */
public class OuterTest1 {
	
	/**
	 * 外部类的方法
	 * @return 返回内部类的指针引用
	 */
	public Inner getInner(){
		return new Inner();
	}
	
	public class Inner{
		
	}
	/**
	 * 创建并初始化一个指向内部类的引用
	 */
	public static void main(String[] args) {

		OuterTest1 out = new OuterTest1();
		/**
		 * 从静态方法中创建内部类对象
		 * 外部类链接到内部类
		 * 内部类对象只能在与其外围类对象相关联的情况下被创建
		 */
		OuterTest1.Inner inner = out.new Inner();
		
		/**
		 *  从静态方法中创建内部类对象
		 *  调用外部类方法返回内部类对象
		 */
		OuterTest1.Inner inner2 = out.getInner();
	}
}
