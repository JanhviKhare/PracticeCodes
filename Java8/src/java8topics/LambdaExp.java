package java8topics;
import java.util.function.Function;


public class LambdaExp {

	public static void main(String[] args) {
		
		Cab cab=(String source,String destination)->{System.out.println("ola cab is booked from" +source+"to" +destination);
		}
		cab.bookCab("hyd","mumbai");
		// TODO Auto-generated method stub

	}

}
