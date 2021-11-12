package multithreading;

public class ThreadName extends Thread {
  public void run() {
	  System.out.println("user's thread");
	  System.out.println(Thread.currentThread().getName());

	  Thread.currentThread().setName("janhvi");

	  System.out.println(Thread.currentThread().getName());

	  System.out.println(Thread.currentThread().isAlive());
	  
  }
	
  
  public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
	  ThreadName td=new ThreadName();
	  td.start();
	  
	  System.out.println(Thread.currentThread().getName());

	  System.out.println(td.currentThread().isAlive());
	  

	  
	  
	}

}
