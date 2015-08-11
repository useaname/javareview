package static_keywords;

public class Person {
	private String name;
	private int age;
	private static String city = "A城";
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
	
	public static void info(){
		//System.out.println(this.name);
		System.out.println(city);
		
	}
}
