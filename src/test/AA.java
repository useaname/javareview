package test;

public class AA {
	public static void main(String[] args) {
		String str = "12321+12+3";
		String[] s = str.split("\\|");
		for (String string : s) {
			System.out.println(s);
		}
	}
}
