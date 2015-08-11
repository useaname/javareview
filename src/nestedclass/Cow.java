package nestedclass;

public class Cow {
	private double weight;

	public Cow() {
	}

	public Cow(double weight) {
		this.weight = weight;
	}

	private class CowLeg {
		private double length;
		private String color;

		public CowLeg(double length, String color) {
			this.color = color;
			this.length = length;
		}

		public double getLength() {
			return length;
		}

		public void setLength(double length) {
			this.length = length;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		// 非静态内部类的实例方法
		public void info() {
			System.out.println("当前牛腿的颜色是" + color + ",高" + length);
			//直接访问外部类private属性 weigth
			System.out.println("本牛腿所在地奶牛重" + weight);
		}
	}

	public void test() {
		CowLeg cl = new CowLeg(1.12, "黑白");
		cl.info();
		
	}

	public static void main(String[] args) {
		Cow c = new Cow(37.8);
		c.test();
	}
}
