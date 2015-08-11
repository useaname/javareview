package test;

public class StringTest {
	private String s;
	static String s1;
	public static void main(String[] args) {
		System.out.println(new StringTest().s); //null
		System.out.println(new StringTest().s1); //null
		
		String[] str1=new String[3]; //动态初始化， 自动分配值
		String[] str2={"a","b","c"}; //静态分配值
		String[] str3 ;
		str3 = new String[]{"a","b"};//动态初化
	}

}
