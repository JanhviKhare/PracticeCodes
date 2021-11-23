package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Product{
	int id;
	String names;
	double price;
	
	public Product(int id,String names,double price) {
		this.id=id;
		this.names=names;
		this.price=price;
		
	}
	
}

public class Filter3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//code1
		
		
		List<String> name =Arrays.asList("Reena",null,"Tina","Mena","janhvi",null,"welcome");
		
		
		 List<String> result=name.stream().filter(i->i!=null).collect(Collectors.toList());
		
		System.out.println(result);
		
		
		//code2
		
		
		
		List<Product>productList=new ArrayList<Product>();
		
		productList.add(new Product(1,"hp",25000));
		productList.add(new Product(1,"dell",35000));
		productList.add(new Product(1,"asus",45000));
		productList.add(new Product(1,"apple",55000));
		productList.add(new Product(1,"lenovo",65000));
		
		
		productList.stream().filter(i->i.price>3500).forEach(System.out::println);
		
		
	
		
	}

}
