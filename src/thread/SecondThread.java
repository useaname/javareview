package thread;
 /* 
 *采用实现Runnable接口，能共享target类
 */
public class SecondThread implements Runnable {
	private int i = 0;

	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "" + i);
			if (i == 20) {
				SecondThread st = new SecondThread();
				// 通过new Thread(target,name)方式创建线程
				new Thread(st, "xc1").start();
				new Thread(st, "xc2").start();
			}
		}
	}

	@Override
	public void run() {
		for (; i < 1000; i++) {
			// 使用实现Runnable接口，只能用Thread.currentThread()方法
			System.out.println(Thread.currentThread().getName() + "" + i);
		}
	}
}
