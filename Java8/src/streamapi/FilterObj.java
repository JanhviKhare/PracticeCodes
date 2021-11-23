package streamapi;

	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;
	public class FilterObj {
		int id;
		String names;
		double price;
		
		public FilterObj(int id,String names,double price) {
			this.id=id;
			this.names=names;
			this.price=price;
			
		}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<FilterObj>productList=new ArrayList<FilterObj>();
		
		productList.add(new FilterObj(1,"hp",25000));
		productList.add(new FilterObj(1,"dell",35000));
		productList.add(new FilterObj(1,"asus",45000));
		productList.add(new FilterObj(1,"apple",55000));
		productList.add(new FilterObj(1,"lenovo",65000));
		
		
		productList.stream().filter(i->i.price>3500).forEach(System.out::println);
		
		


	}

}
