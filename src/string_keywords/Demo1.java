package string_keywords;

public class Demo1 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "bcd";
		String s3 = s1;
		s1 += s2;
		System.out.println(s1);
		System.out.println(s3);
		System.out.println(s1 == s3);
	}
}
