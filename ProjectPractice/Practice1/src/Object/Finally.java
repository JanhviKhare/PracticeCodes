package Object;

import java.io.FileInputStream;
import java.io.IOException;

public class Finally {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		try {
			int a=100,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		//catch(ArithmeticException e)
		//{
		//	System.out.println(e);
			
		
		finally {
			System.out.println("block of finally");

		}
		FileInputStream myfile=null;
		try {
			 myfile = new FileInputStream("d:/abc.txt");
			Class.forName("com.mysql.jdbc.Driver");
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		finally {
			
		
			if(myfile !=null)
			{
				myfile.close();
			}
			System.out.println("file closed");

			
		}
		System.out.println("end");

	
	}

}
