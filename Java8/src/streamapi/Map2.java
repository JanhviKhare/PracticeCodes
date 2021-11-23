package streamapi;

import java.util.Arrays;
import java.util.List;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numberList=Arrays.asList(3,8,9,21);
		
		numberList.stream().map(i->i*3).forEach(System.out::println);		

	}

}
