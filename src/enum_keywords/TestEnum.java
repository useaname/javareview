package enum_keywords;

public class TestEnum {
	public void judge(SeasonEnum s) {
		switch (s) {
		case SPRING:
			System.out.println("��ů����");
			break;
		case SUMMER:
			System.out.println("��������");
			break;
		case FALL:
			System.out.println("�����ˬ");
			break;
		case WINTER:
			System.out.println("����Ʈѩ");
			break;
		}
	}
	public static void main(String args[]){
		for(SeasonEnum s : SeasonEnum.values()){
			System.out.println(s);
		}
		new TestEnum().judge(SeasonEnum.FALL);
	}
}
