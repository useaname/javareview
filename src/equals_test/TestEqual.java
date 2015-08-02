package equals_test;

public class TestEqual {
	public static void main(String[] args) {
		int it = 65;
		float it1 = 65f;
		System.out.println(it==it1);//true
		char ch = 'A';
		System.out.println(it==ch);//true
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1==str2);//false
		System.out.println(str1.equals(str2));//true
	}
}
