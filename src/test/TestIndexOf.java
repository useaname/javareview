package test;

public class TestIndexOf {
	public static void main(String[] args) {
		String path = "list.do";
		int doPost = path.indexOf(".");
		System.out.println(doPost);
		String command = path.substring(0,doPost);
		System.out.println(command);
	}
}
