package interface_keywords;

/**
 * ����ģʽʵ��
 * ���������Ϊ����
 */
public class TestCommand {
	public static void main(String[] args) {
		ProcessArrary pa = new ProcessArrary();
		int[] target = { 3, -4, 5, 7, 8 };
		pa.process(target, new PrintCommand());
		System.out.println("-------------");
		pa.process(target, new AddCommand());
	}
}
