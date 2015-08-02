package nestedclass.newadd;

public class OuterTest2 {
	
	class Inner{
		OuterTest2 getOut(){
			//单纯this指向到是OuterTest2.Inner
			//出错
			//return this;
			
			
			//生成外部类对象的引用)
			//此处返回OuterTest2对象的引用
			return OuterTest2.this;
		}
	}
	
	
	public static void main(String[] args) {
		/**
		 * 通过外围类对象创建被不累对象
		 * 内部类对象会连接到创建它的外部类对象上,
		 * 所以在拥有外部类对象之前不可能创建内部类对象,嵌套类除外(静态内部类)
		 */
		OuterTest2 ot2 = new OuterTest2();
		OuterTest2.Inner inner = ot2.new Inner();
	}
}
