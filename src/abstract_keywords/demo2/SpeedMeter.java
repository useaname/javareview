package abstract_keywords.demo2;

public abstract class SpeedMeter {
	private double turnRate;
	
	public SpeedMeter(){}
	public void  setTurnRate(double turnRate){
		this.turnRate = turnRate;
	}
	//定义计算速度的通用算法
	public double getSpeed(){
		return java.lang.Math.PI*2*getRadius()*turnRate;
	}
	public abstract double getRadius();
}
