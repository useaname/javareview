package nestedclass;

interface Product{
	public double getPrice();
	public String getName();
}
/**
 *上面的TestAnonymous类定义一个test方法，该方法需要一个Product对象，但Product只是一个接口
 *无法创建对象，因此此处考虑创建一个Product接口实现类的对象传入，该方法--如果Product接口实现类
 *需要重复使用，则应该将该实现类定成一个独立的类；如果这个Product接口实现类之需使用一次使用，则可
 *采用下面程序中的方式定义一个匿名内部类。
 */
/*
 class AnonymousProduct implements Product{
 	public double getPrice(){
 		return 567;
 	}
 	
 	public String getName(){
 		return "AGP显卡";
 	}
 }
 ta.test(new AnonymousProduct());
 */
public class TestAnonymous {
	public void test(Product p){
		System.out.println("购买力一个"+ p.getName() + ",花掉了" + p.getPrice());
	}
	public static void main(String[] args) {
		TestAnonymous ta = new TestAnonymous();
		//调用test方法，需要传入一个Product参数，此处传入其匿名类的实例
		ta.test(new Product() {
			
			@Override
			public double getPrice() {
				return 567;
			}
			
			@Override
			public String getName() {
				return "AGP显卡";
			}
		});
	}
}
