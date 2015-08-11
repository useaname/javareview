package nestedclass;

public class TestStaticInnerClass {
	private int prop1 = 5;
	private static int prop2 = 2;

	static class StaticInnerCalss {
		private static int age;

		public void accessOutProp() {
			// 静态内部类无法访问外部类的实例成员
			// System.out.println(prop1);
			// 代码正常
			System.out.println(prop2);
		}
	}
}
