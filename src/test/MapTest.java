package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		Map<String,Person> hotel = new HashMap<String,Person>();
		System.out.println(hotel.isEmpty());//是否为空
		
	}
}
class Person{
	String name;int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "name:" + name +",age:" + age;
	}
}
