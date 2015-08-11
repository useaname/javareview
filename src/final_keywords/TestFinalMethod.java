package final_keywords;
/**
 *final修饰的方法不可能被重写 
 */
public class TestFinalMethod {
	public final void test(){}
}
class Sub extends TestFinalMethod{
	//下面方法将出现编译错误 不能重写fianl方法
	//public void test(){}
}
