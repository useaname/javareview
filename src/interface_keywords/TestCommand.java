package interface_keywords;

/**
 * 命令模式实现
 * 将处理和行为分离
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
