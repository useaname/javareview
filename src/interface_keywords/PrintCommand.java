package interface_keywords;

public class PrintCommand implements Command {

	@Override
	public void process(int[] target) {
		for (int i : target) {
			System.out.println("迭代的目标数组元素:"+i);
		}
	}
	
}
