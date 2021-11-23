package streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SreamMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vechilesList=Arrays.asList("bus","car","train","bus","bike","car");
		
		List<String>distinctVechiles=vechilesList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctVechiles);
		
		vechilesList.stream().distinct().forEach(value->System.out.println(value));	
		
		 long count =vechilesList.stream().distinct().count();
		System.out.println(count);
		
		List<String>limitedVechiles=vechilesList.stream().limit(3).collect(Collectors.toList());
		System.out.println(limitedVechiles);
		
		
	  List<Integer>numberList=Arrays.asList(1,2,3,4,5,6,7,8);
		Optional <Integer> min=numberList.stream().min((val1,val2)->{
			return val1.compareTo(val2);
			
		});
			System.out.println(min.get());

}

		
		
		
		
		

	}


