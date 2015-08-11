package equals_test;

public class Person {
	int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	String name;
	int age;

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

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		// 只有当obj是Person对象
		if (obj != null && obj.getClass() == Person.class) {
			Person personObj = (Person) obj;
			// 并且当前对象的id和obj对象id相等才能判断两个对象相等
			if (this.getId() == personObj.getId()) {
				return true;
			}
		}
		return false;
	}
}
