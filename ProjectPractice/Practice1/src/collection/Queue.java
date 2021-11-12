package collection;

import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add(10);
		pq.add(20);
		pq.add(20);
		pq.add(30);
		pq.offer(40);
		
		System.out.println(pq);
		
		
		//getting head element
		
	 System.out.println(pq.element()); //if empty queue ,it gives exception
	 
	 System.out.println(pq.peek());// if queue is empty ,gives null.
	 
	 //remove and return the head element
	 
	 System.out.println(pq.poll());
	 System.out.println(pq.remove());
		
		

	}

}
