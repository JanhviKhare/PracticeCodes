package collection;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hm=new HashMap();
		
		hm.put(101,"A");
		hm.put(102,"B");
		hm.put(103,"C");
		hm.put(101,"D");
		System.out.println(hm);
		
	}

}
