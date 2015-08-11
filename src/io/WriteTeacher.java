package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteTeacher {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(".//src//io//teacher.txt"));
			Person stu = new Person("stu1", 20);
			Teacher t1 = new Teacher("t1",stu);
			Teacher t2 = new Teacher("t2",stu);
			oos.writeObject(t1);
			oos.writeObject(t2);
			oos.writeObject(stu);
			oos.writeObject(t2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != oos){
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
class Teacher implements Serializable {
	private String name;
	private Person person;
	
	public Teacher (String name,Person person) {
		this.name = name;
		this.person = person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}