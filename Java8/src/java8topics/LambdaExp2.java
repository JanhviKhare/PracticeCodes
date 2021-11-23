package java8topics;
import java.util.ArrayList;
import java.util.function.Predicate;
class Employee{
	public static final int Salary = 0;
	String Name;
	int salary;
	int Exp;
	

Employee(String name,int sal,int exp){
	Name=name;
	salary=sal;
	Exp=exp;
	
}
	
}


public class LambdaExp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee("A",50000,5);
		//example1
		Predicate<Employee> p=e->(e.Salary>30000 && e.Exp>3);
	System.out.println(p.test (emp));
	
	//example2
	ArrayList<Employee> al=new ArrayList<Employee>();
	al.add(new Employee("JOhn",50000,5));
	al.add(new Employee("JOhn1",70000,2));
	al.add(new Employee("JOhn2",30000,4));
	al.add(new Employee("JOhn3",20000,8));	
	al.add(new Employee("JOhn4",80000,5));

	
for(Employee e:al) {
	if(p.test(e)) {
		System.out.println(e.Name+" "+e.Salary);
		
	}
}
	}

}
