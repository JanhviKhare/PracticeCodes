package streamapi;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Filter1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>numberList=new ArrayList<Integer>();
		
		ArrayList<Integer>evenNumber=new ArrayList<Integer>();
		
		numberList.add(1);
		numberList.add(2);
		numberList.add(3);
		numberList.add(4);
		
		numberList.add(5);
		

		numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(evenNumber)); // filtering the collection and printing 
		numberList.stream().filter(n->n%2==0).collect(Collectors.toList());//filtering the coolection and then putting in another collection
		//System.out.println(evenNumber);
		
	}

}
