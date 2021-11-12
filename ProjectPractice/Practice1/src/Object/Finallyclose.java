package Object;

import java.io.FileInputStream;
import java.io.IOException;

public class Finallyclose {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
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
