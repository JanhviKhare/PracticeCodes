package multithreading;

public class DaemonThread extends Thread {
	public void run() {
		System.out.println("Welcome to thread");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaemonThread dt=new DaemonThread();
		System.out.println("main Thread");
		dt.setDaemon(true);
		dt.start();
		System.out.println(dt.currentThread().getName());
		
	}

}
