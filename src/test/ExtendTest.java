package test;

class Child{
	public Child() {
		System.out.println("Child Create");
	}
}
public class ExtendTest extends Child {
	public ExtendTest() {
		System.out.println("Extend Create");
	}
	public static void main(String[] args) {

		Child c = new Child();
		ExtendTest e = new ExtendTest();
	}
}
