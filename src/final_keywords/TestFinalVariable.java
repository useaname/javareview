package final_keywords;

public class TestFinalVariable {
	//定义成员变量指定默认值 合法
	final int a = 6;
	//下面变量将在构造器或初始化块中分配初始值
	final String str;
	final int c;
	final static double d;
	//既没有指定默认值 又没有在初始块 构造器中指定初始值下面定义的char类型是不合法的
	//final char ch;
	{
		str = "hello";
		//a属性已经指定了默认值 不能为a重新赋值
		//a = 9;
	}
	static{
		//在静态初始化块中为类属性指定初始值 合法
		d = 5.6;
	}
	public TestFinalVariable() {
		//构造器客队没有指定默认值 且没有在初始化块中指定初始值的实力属性指定初始值
		c = 5;
		//初始块中已经对str制定了初始化值 构造器中不能对final变量重新赋值
		//str = "java";
	}
	public void changeFinal(){
		//普通方法不能为final修饰成员变量赋值
		//d = 1.2;
	}
	public static void main(String[] args){
		TestFinalVariable tfv = new TestFinalVariable();
		System.out.println(tfv.a);
		System.out.println(tfv.c);
		System.out.println(tfv.d);
	}
}
