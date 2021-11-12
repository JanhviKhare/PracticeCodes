package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {
	public static void main(String [] args)
	{
		ArrayList al=new ArrayList();
		//ArrayList <String> al= new ArrayList<String>();
		//ArrayList <Integer> al=new ArrayList <Integer>();
		
		al.add(100);
		al.add("hello");
		al.add("A");
		al.add(10.2);
		al.add(345688698);
		al.add(true);
		System.out.println(al);
		System.out.println( "size of arraylist:" +al.size());
		al.remove(2);
		System.out.println( "After removing :" +al);
		al.add(2,"welcome");
		
		System.out.println("after adding:" +al);
		
		System.out.println(al.get(0));
		
		al.remove(0);
		System.out.println(al);
		
		al.set(3,"Hii");
		System.out.println(al);
		
		
		System.out.println(al.contains("Hii"));
		/*Iterator it=al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		
	}
	

}
