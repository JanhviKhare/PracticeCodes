package collection;

import java.util.HashSet;

public class HashSetPractice {
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(100);
		hs.add("Janhvi");
		hs.add(20);
		hs.add("X");
		
		 System.out.println(hs);
		 
		 hs.remove("X");
		 System.out.println(hs);
		 
		 System.out.println(hs.contains("X"));
		 
		 for(Object e:hs)
		 {
			 System.out.println(e);
		 }
		 
		 HashSet hs2=new HashSet();
		 
		 hs2.add("hii");
		 hs2.add(100);
		 hs2.add(20);
		 hs2.add("X");
		 hs2.addAll(hs);
		
		 System.out.println(hs2);//union
		 
		 hs2.retainAll(hs);
			
		 System.out.println(hs);//intersection
		 
		 hs.containsAll(hs2);//subset
		 
		 
			
		 System.out.println(hs);
		 
		 
		 
		 
		 
	
		 
		 
		 
	}
	

}
