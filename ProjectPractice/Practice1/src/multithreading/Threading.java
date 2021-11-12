package multithreading;

public class Threading extends Thread {
	
	public void run() {
		System.out.println("welcome to thread");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threading td=new Threading();
		td.start();

	}

}
