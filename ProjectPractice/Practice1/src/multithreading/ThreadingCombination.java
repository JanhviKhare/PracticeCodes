package multithreading;


//CASE 1 - Single task from single Thread

/*public class ThreadingCombination  extends Thread{
	
	public void run() {
		System.out.println("Case 1");
			}
	
	public static void main (String [] args) {
		ThreadingCombination tc=new ThreadingCombination();
		tc.start();*/

//CASE 2 - Single task from multiple Thread


public class ThreadingCombination  extends Thread{
	
	public void run() {
		System.out.println("Case 2");
			}
	
	public static void main (String [] args) {
		ThreadingCombination tc1=new ThreadingCombination();
		tc1.start();
		
		ThreadingCombination tc2=new ThreadingCombination();
		tc2.start();

//CASE 3

	}

}
