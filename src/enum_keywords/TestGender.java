package enum_keywords;

public class TestGender {
	public static void main(String[] args) {
		//ͨ��Enum��valueof��������ȡָ��ö�����ö��ֵ
		Gender g = Enum.valueOf(Gender.class, "FEMALE");
		g.name = "Ů";
		System.out.println(g+"����:"+g.name);
	}
}
