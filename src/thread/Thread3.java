package thread;

public class Thread3 extends Thread{
	public void run(){
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName()+""+i);
		}
	}
	
	public static void main(String[] args){
		new Thread3().start();
		new Thread3().start();
	}
}
