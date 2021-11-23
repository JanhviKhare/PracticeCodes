package java8topics;
import java.util.function.Predicate;

public class Predicate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,24,3,5,60,7,80,9};
		Predicate<Integer> even=e->e%2==0;
		Predicate<Integer> greater=i->i>50;
		for(int n:a) {
			if(even.test(n)&& greater.test(n)) {
				System.out.println(n);
				
			}
		}
		
		

	}

}
