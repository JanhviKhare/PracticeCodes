package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
 
class Student{
	int rollNo;
	String name;
	int age;
 
	public Student(int rollNo, String name, int age){
	
        this.rollNo = rollNo;  
        this.name = name; 
        this.age = age;
	}
}
 
public class CollectorClass {
	public static void main(String args[]){
	List<Student> list=new ArrayList<Student>();  
 

        list.add(new Student(1,"Janhvii", 25));  
        list.add(new Student(3,"harshit", 24));  
        list.add(new Student(2,"Avika", 25));  
        list.add(new Student(6,"Jai", 24));  
        list.add(new Student(7,"Akansha", 26));  
        list.add(new Student(12,"aranav", 25));
 
               
        List<String> names = list.stream() 
                                     .map(n->n.name) 
                                     .collect(Collectors.toList());
        System.out.println(names);         	
     }
}