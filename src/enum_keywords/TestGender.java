package enum_keywords;

public class TestGender {
	public static void main(String[] args) {
		//通过Enum的valueof方法来获取指定枚举类的枚举值
		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		g.name = "女";
		System.out.println(g+"代表:"+g.name);
	}
}
