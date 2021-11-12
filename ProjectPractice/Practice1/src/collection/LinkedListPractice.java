package collection;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedListPractice {
	private static final String Collections = null;

	public static void main(String [] args) {
		//LinkedList <Integer> ll=new LinkedList<Integer>();
		LinkedList ll=new LinkedList();
		ll.add("X");
		ll.add("H");
		ll.add("A");
		ll.add("b");

		ll.add(null);
		System.out.println(ll);
		ll.remove(4);
		System.out.println(ll);
		
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.contains("Happy"));
		ll.set(2, "X");
		System.out.println(ll);
		
		LinkedList ll2=new LinkedList();
		ll2.addAll(ll);
		System.out.println(ll2);
		
		//Collection.sort(ll2,Collections,reverseOrder());
		
		
		LinkedList ll3=new LinkedList();
		ll3.add("Aple");
		ll3.add("Mango");
		ll3.add("Lichi");
		ll3.add("Grapes");
		
		System.out.println(ll3);
		ll3.addFirst("Guavava");
		System.out.println(ll3);
		System.out.println(ll3.removeLast());
		

		
	}

	

}
