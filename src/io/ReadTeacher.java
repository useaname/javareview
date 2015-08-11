package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReadTeacher {
	public static void main(String[] args) {
		ObjectInputStream oos = null;
		try {
			oos = new ObjectInputStream(new FileInputStream(".//src//io//teacher.txt"));
			Teacher t1 = (Teacher)oos.readObject();
			Teacher t2 = (Teacher)oos.readObject();
			Person stu = (Person)oos.readObject();
			Teacher t3 = (Teacher)oos.readObject();
			
			System.out.println(t1.getPerson() == stu); //true
			System.out.println(t2.getPerson() == stu); //true
			System.out.println(t2 == t3); //true
			
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
			if (null != oos) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
