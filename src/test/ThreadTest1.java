package test;

public class ThreadTest1 extends Thread {
	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1();
		ThreadTest1 tt2 = new ThreadTest1();
		tt1.start();
		tt2.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 100; i++) {
			System.out.println(this.getName()+":"+i+":");
		}
	}
}
