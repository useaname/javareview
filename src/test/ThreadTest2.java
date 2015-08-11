package test;

public class ThreadTest2 implements Runnable {
	
	private int i = 0;
	
	public static void main(String[] args) {
		ThreadTest2 tt1 = new ThreadTest2();
		ThreadTest2 tt2 = new ThreadTest2();
		new Thread(tt1).start();
		new Thread(tt2).start();
	}
	
	public void run() {
		for (; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() +":"+i+":");
		}
	}
}
