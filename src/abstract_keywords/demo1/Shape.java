package abstract_keywords.demo1;

public abstract class Shape {
	{
		System.out.println("执行shape的初始坏块。。。");
	}
	private String color;
	//定义一个计算周长的抽象方法
	public abstract double calPerimeter();
	//定义一个返回形状的抽象方法
	public abstract String getType();
	//定义shape构造器 该构造器不是用于创建shape对象，而是用于被子类掉哟个
	public Shape(){}
	public Shape(String color){
		System.out.println("执行Shape的构造器...");
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
