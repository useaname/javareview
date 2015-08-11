package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutputStreamTest {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		
		try {
			//创建一个ObjectOutputStream输出流
			oos = new ObjectOutputStream(new FileOutputStream("src//io//person.txt"));
			Person p1 = new Person("swk", 20);
			//把对象写入输出流
			oos.writeObject(p1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { 
				try {
					if (null != oos) {
						oos.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private int age;
	
	public Person(String name,int age) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}