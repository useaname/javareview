package closur_callback;

public class TeachableProgrammer extends Programmer{
	public TeachableProgrammer() {}
	public TeachableProgrammer(String name) { super(name); }
	private void teach(){
		System.out.println(getName() + "教师在讲台上讲课... ...");
	}
	private class Closure implements Teachable{
		/*
		  静态内部类回调外部类实现work方法，非静态内部类引用
		  的作用仅仅是向客户端提供一个回调外部类的途径
		*/
		@Override
		public void work() {
			teach();
		}
	}
	//返回一个非静态内部类引用，允许外部类通过该非静态内部类引用来调外部类方法
	public Teachable getCallbackReference(){
		return new Closure();
	}
}
