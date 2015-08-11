package test;

public class SwitchTest {
	public static void main(String[] args) {
		int x = 1;
		switch(x){
		case 1:
			System.out.println("Test1");
		case 2:
		case 3:
			System.out.println("Test2");
			break;
		}
		System.out.println("Test3");
	}
}