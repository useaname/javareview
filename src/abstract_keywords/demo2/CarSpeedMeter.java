package abstract_keywords.demo2;
/**
 * 模板模式
 * 父类的普通方法依赖与一个抽象方法
 * 而抽象方法则推迟到子类中提供实现
 */
public class CarSpeedMeter extends SpeedMeter {

	@Override
	public double getRadius() {
		return 0.28;
	}
	
	public static void main(String[] args) {
		CarSpeedMeter csm = new CarSpeedMeter();
		csm.setTurnRate(15);
		System.out.println(csm.getSpeed());
	}
	
}
