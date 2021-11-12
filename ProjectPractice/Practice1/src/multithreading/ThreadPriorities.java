package multithreading;

public class ThreadPriorities extends Thread  {
	
	public void run() {
		System.out.println( "child thread");
		System.out.println("old child priority:" +Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}
	
	
	public static void main (String [] args) {
		System.out.println("old main priority:" +Thread.currentThread().getPriority());
		
		ThreadPriorities tp=new ThreadPriorities();
	//	System.out.println("old child priority:" +Thread.currentThread().getPriority());
		tp.setPriority(MAX_PRIORITY);
		tp.start();
		
		 
		
	}

}
