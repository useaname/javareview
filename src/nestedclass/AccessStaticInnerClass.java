package nestedclass;

public class AccessStaticInnerClass {
	static class StaticInnerClass{
		private static int prop = 5;
		private int prop2 = 9;
	}

	public void accessInnerProp(){
		//代码出错 
		//System.out.println(prop1);
		//应通过类名点属性名访问静态内部类的类成员
		System.out.println(StaticInnerClass.prop);
		
		//代码出错
		//System.out.println(prop2);
		//通过实例访问静态内部类的实例成员
		System.out.println(new StaticInnerClass().prop2);
	}
}
