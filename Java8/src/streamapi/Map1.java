package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> vechiles=Arrays.asList("car","bus","byke","cycle");
		List<String> Resultvechiles= new ArrayList<String>();
		
		 Resultvechiles=vechiles.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
		 
		 System.out.println(Resultvechiles);
		 
		
		
		

	}

}
