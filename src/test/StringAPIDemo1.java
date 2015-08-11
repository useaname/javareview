package test;

/**
 * 字符串拆分
 * 
 */
public class StringAPIDemo1 {
	public static void main(String[] args) {
		String str = "Tom:20|Leey:25";
		Split(str);
	}

	static void Split(String str) {
		String[] s1 = str.split("\\|");
		for (String s : s1) {
			String[] s2 = s.split(":");
			System.out.println(s2[0] + " " + s2[1]);
		}
	}
}
