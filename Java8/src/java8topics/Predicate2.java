package java8topics;


import java.util.ArrayList;
import java.util.function.Predicate;

	class Employee{
		String Name;
		int Salary;
		int Exp;
		     
		Employee(String name,int salary, int exp){
			Name=name;
	            Salary=salary;
	           Exp=exp;
			
		}
	}


public class Predicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Lambda expression to check the salary is greater than 30000 and exp should greater than 5years ,is satisfied return name of employee
     
		
		Employee emp=new Employee("A",50000,7);

      Predicate<Employee>e= i->(i.Salary>30000 && i.Exp>5);
       e.test(emp);
		
		System.out.println(e.test(emp));
		
		
		//Lambda exp to check the salary is greater than 30000 and exp should greater than 5years  on many objects,is satisfied return name of employee
	 
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee("A",50000,3));

		al.add(new Employee("B",20000,7));

		al.add(new Employee("C",60000,3));

		al.add(new Employee("D",80000,9));
		
		for(Employee a:al) {
			if(e.test(a)) {
				System.out.println(a.Name+  "    "+a.Salary);
			}
		}
	}

}
