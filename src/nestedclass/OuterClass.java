package nestedclass;

public class OuterClass {
	private int outProp = 9;
	class Inner{
		private int inProp = 5 ;
		public void acessOuterProp(){
			//非静态内部类可以直接访问外部类成员
			                                       //OuterClass.this.outProp
			System.out.println("外部类outProp属性值:"+ outProp);
		}
	}
	public void accessInnerProp(){
		//外部类不能直接访问非静态内部类的实例属性 下面代码出现编译错误
		//System.out.println("内部类的inProp属性值:" + inProp);
		//如需访问内部类的实例属性 必须显示的创建内部类对象
		System.out.println("内部类的inProp属性" + new Inner().inProp);
	}
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		out.accessInnerProp();
	}
}
