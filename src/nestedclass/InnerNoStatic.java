package nestedclass;

public class InnerNoStatic {
	//Java不允许在非静态内部类里定义静态成员。(非静态内部类不能有静态方法，静态属性，静态初始化块)
	private class InnerClass{
		/**
		 * 下面三个静态声明
		 * 都将引发编译错误
		 */
//		static{
//			System.out.println("--------------");
//		}
//		private static int inProp;
//		private static void test();
	}
}
