package java8topics;

import java.util.List;
import java.util.ArrayList;

public class MethodRef {
	 

	   public static void main(String args[]) {
	      List names = new ArrayList();
			
	      names.add("abc");
	      names.add("def");
	      names.add("fhi");
	      names.add("j");
	      names.add("K");
			
	      names.forEach(System.out::println);
	   }
}
