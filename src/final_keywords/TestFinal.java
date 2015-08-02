package final_keywords;

public class TestFinal {
	/**
	 * final修饰的变量 (包括实例属性和类属性)必须显示初始化
	 */
	final int age;
	{
		//系统不会对fianl修饰的成员属性进行
		//默认初始坏 下面代码将引起错误
		//System.out.println(age);
		age = 6;
		System.out.println(age);
	}
	public static void main(String[] args) {
		new TestFinal();
	}

}
