
package Object;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fis=new FileInputStream("d:/abc.txt");
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		System.out.println("hello");
		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		System.out.println("end");

	}

}
