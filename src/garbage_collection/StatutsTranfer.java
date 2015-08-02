package garbage_collection;

public class StatutsTranfer {
	public static void test(){
		String a = new String("JAVA");//激活状态
		a = new String("Struts");//JAVA字符串属于去活状态，Struts字符串属于激活状态
	}
	public static void main(String[] args) {
		test();
	}
}
