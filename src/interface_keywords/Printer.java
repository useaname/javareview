package interface_keywords;

public class Printer implements Output,Product {
	private String[] printData = new String[MAX_CACHE_LINE];
	//用记录当前需打印的作业数
	private int dataNum = 0;
	
	@Override
	public int getProduceTime() {
		return 45;
	}

	@Override
	public void out() {
		//只要还有作业 继续打印
		while(dataNum > 0){
			System.out.println("打印机打印"+printData[0]);
			//把作业队列整体前移一位 并将剩下的作业数减一
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}

	@Override
	public void getData(String msg) {
		if(dataNum >= MAX_CACHE_LINE){
			System.out.println("输出队列已满，添加失败");
		}else{
			printData[dataNum++] = msg;
		}
	}
	
	public static void main(String[] args) {
		//创建一个Printer对象 当成Output使用
		Output o = new Printer();
		o.getData("A");
		o.getData("B");
		o.out();
		o.getData("C");
		o.getData("D");
		o.out();
		//创建一个Printer对象 当成Product使用
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		//所有接口类型的引用变量都可以直接赋值给Object类型的变量
		Object obj = p;
	}

}
interface Product{
	int getProduceTime();
}
