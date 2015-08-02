package closur_callback;

public class TestTeachableProgrammer{
	public static void main(String[] args) {
		TeachableProgrammer tp = new TeachableProgrammer("ภ๎ธี");
		tp.work();
		tp.getCallbackReference().work();
	}
}
