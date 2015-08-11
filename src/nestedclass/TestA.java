package nestedclass;

interface A {
	void test();
}

public class TestA {
	public static void main(String[] args) {
		int age = 0;
		final int age1 = 1;
		A a = new A() {
			@Override
			public void test() {
				// 下面语句会提示错误 匿名内部类访问局部变量必须使用final修饰符
				// System.out.println(age);

				// 通过编译
				System.out.println(age1);
			}
		};
	}
}
