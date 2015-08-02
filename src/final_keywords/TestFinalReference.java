package final_keywords;

import java.util.Arrays;
/**
 * final修饰引用变量
 *
 */
public class TestFinalReference {
	public static void main(String[] args) {
		//final修饰的数组变量 iArr是一个引用变量
		final int[] iArr = {5,6,12,9};
		System.out.println(Arrays.toString(iArr));
		//对数组元素进行排序，合法
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		System.out.println(Arrays.toString(iArr));
		//对数组元素赋值，合法
		iArr[2] = -8;
		System.out.println(Arrays.toString(iArr));
		//下面对iArr重新赋值 ，非法
		//iArr = null;
		
		final Person p = new Person(12);
		//改变Person对象的age属性 合法
		p.setAge(20);
		//对p重新赋值 非法
		//p = null;
	}
	
}

class Person{
	private int age;
	public Person(){}
	public Person(int age){
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
