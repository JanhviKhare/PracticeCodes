package java8topics;
import java.util.function.Function;

import java.util.ArrayList;

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

public class Function2 {

	public static void main(String[] args) {
		ArrayList <Employee> emp =new ArrayList<Employee>();
		emp.add(new Employee("A",50000,4));
		emp.add(new Employee("b",20000,4));
		emp.add(new Employee("c",80000,4));
		emp.add(new Employee("d",10000,4));
		

		Function<Integer,Integer>f=i->{
			int s=i.Salary;
										
										if(s>50000 && s<70000)
											return (s*10/100);
										else if(s>20000&& s<30000)
											return( s*20/100);
										
										else
											return(s*40/100);
										
											
		};
		
	}
}


