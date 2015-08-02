package interface_keywords;

/**
 * 对数组处理的类
 */
public class ProcessArrary {
	/**
	 * 
	 * @param target

	 *            要处理的数组
	 * @param cmd
	 *            对数组处理的行为
	 */
	public void process(int[] target, Command cmd) {
		cmd.process(target);
	}
}
