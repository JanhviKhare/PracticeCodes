package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList2 {
	public static void main(String [] args)
	{
		ArrayList al1=new ArrayList();
		
		al1.add(100);
		al1.add(5);
		al1.add(7);
		al1.add(10.2);
		al1.add(345);
		al1.add(0);
		

		ArrayList al2=new ArrayList();
		al2.addAll(al1);
		System.out.println(al2);
		
		al2.removeAll(al1);
		System.out.println(al2);
		System.out.println(al1);
		Collections.sort(al1);
		System.out.println(al1);
		
		
	}
}
