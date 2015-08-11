package thread;

public class FirstThread extends Thread {
	private int i = 0;
	@Override
	public void run() {
		for(;i < 100;i++){
			//如果线程类继承Thread类 可以直接调用getName()来获取线程名
			//如果想获取当前线程，直接使用This即可
			//Thread类的getName() 返回当前线程的名字
			System.out.println(getName() + i);
		}
	}
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + i);
			if( i == 20){
				//启动第一条线程
				new FirstThread().start();
				//启动第二条线程
				new FirstThread().start();
			}
		}
	}

}
