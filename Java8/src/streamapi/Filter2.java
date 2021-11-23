package streamapi;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Filter2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> name =Arrays.asList("Reena","Tina","Mena","janhvi","welcome");
		
		List<String>finalList=new ArrayList<String>();
		
		finalList=name.stream().filter(i->i.length()>4 && i.length()<8).collect(Collectors.toList());
		System.out.println(finalList);
		
		

	}

}
