package Object;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age=s.nextInt();
		try {
			if(age<18)
			{
				throw new Throw("You are not elible to vote");
			
			}
			else
				{
				System.out.println("please vote");
				}
		}
		catch(Throw e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
		
		

	}

}