package test;

public class Arraytest2 {
	static long  a[] = new long[10];
	//long  a[] = new long[10]; 编译错误 静态成员不能直接访问非静态成员
	public static void main(String[] args) {
		System.out.println(a[6]);
	}
}
