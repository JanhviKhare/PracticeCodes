package multithreading;

public class ThreadMethods extends Thread {
	public void run() {
		Thread.yield();
		
		for(int i=5;i>=1;i--)
		{
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(e);
			}*/
			System.out.println("hi"+i);
			
			}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		for(int i=1;i<=5;i++)
		{
			

				Thread.sleep(1000);
				System.out.println(i);
			}
		}
		
		catch (InterruptedException e) {
				
				System.out.println(e);
			}
		Thread.yield();
			
ThreadMethods tm=new ThreadMethods();
tm.start();

		
		}
		}


