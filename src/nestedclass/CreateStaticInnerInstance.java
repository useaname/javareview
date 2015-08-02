package nestedclass;

public class CreateStaticInnerInstance {
	public static void main(String[] args) {
		StaticOut.StaticIn in = new StaticOut.StaticIn();
		//以上代码可以改为以下两行
		//StaticOut.StaticIn in; 定义一个内部类变量
		//in = new StaticOut.StaticIn(); 通过 外部类实例来调用内部类构造器
	}
}
class StaticOut{
	static class StaticIn{
		public StaticIn(){
			System.out.println("静态类内部构造器");
		}
	}
}

