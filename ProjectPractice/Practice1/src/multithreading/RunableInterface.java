package multithreading;

public class RunableInterface implements Runable {
	public void run() {
		System.out.println("Welcome to runableInterface");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunableInterface ri=new RunableInterface();
		Thread td=new Thread(ri);
		td.start();
		
	}

}
