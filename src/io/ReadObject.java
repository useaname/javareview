package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		try {
			//创建ObjectInputStream输入流
			ois = new ObjectInputStream(new FileInputStream("src//io//person.txt"));
			//从流中读取对象,并强制转换为Person类型
			Person p = (Person)ois.readObject();
			System.out.println("Age:" + p.getAge() + ",name:" + p.getName());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if ( null != ois ) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
