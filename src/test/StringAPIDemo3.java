package test;

public class StringAPIDemo3 {
	public static void main(String[] args) {
		String str = "a你好bc";
		//构建StringBuffer对象
		StringBuffer sb = new StringBuffer(str);
		//实现字符串的反转
		System.out.println(sb.reverse());;
	}
}
