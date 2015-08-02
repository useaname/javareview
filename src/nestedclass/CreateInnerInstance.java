package nestedclass;

class Out{
	//定义一个内部类 不使用访问控制符，即同一个包中其他类可以访问该内部类
	class In{
		public In(String msg){
			System.out.println(msg);
		}
	}
}
/**
 *下面代码创建非静态内部类的对象
 *非静态内部类的构造器必须使用外部类对象来调用 
 */
public class CreateInnerInstance {
	public static void main(String[] args) {
		Out.In in = new Out().new In("测试信息"); //创建了一个非静态内部类的对象(in),而非静态内部类的构造器
		                                        //必须使用外部类对象来调用
		/**
		 * 上面代码可以改为如下三行
		 * Out.In in; 使用OutClass.InnerClass形式定义内部类变量。
		 * Out out = new Out(); 创建外部类实例，非静态内部类实例将寄存该实例中
		 * in = out.new In("测试信息"); 
		 * **/
		
	}
}
