package final_keywords;

public class TestPrivateFinalMethod {
	//对于一个private方法，因为它仅在当前类中可见，其子类无法访问该方法，所以子类无法重写该方法
	//如果子类中定义了一个与父类private方法有相同方法名，相同形参列表。相同返回值类型的方法，也不
	//是方法重写，只是重新定义了一个新方法
	//因此使用 final修饰一个private访问权限的方法 依然可以在子类中定义与该方法具有相同方法名，
	//相当形参列表，相同返回值的方法
	private final void test(){}
}
class Sub1 extends TestFinalVariable{
	public void test(){}
}
