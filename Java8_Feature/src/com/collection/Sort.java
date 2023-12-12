package com.collection;
// sort a Collection using Lambda

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


interface DoubleColon{
	void show();
}

// Example 2 of double colon 
class ABC {
	public static void display() {
		System.out.println("Hi double colon");
	}
}

public class Sort {
	
	//Example 1 of double colon 
	/*public static void display() {
		System.out.println("Hi I am from double colon");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleColon dc  = Sort :: display;
		dc.show();
		*/
	
	public static void main(String[] args) {
		
		DoubleColon dc  = ABC :: display; // Static method no need to create a object
		//DoubleColon dc  = new ABC() :: display; // non static method
		dc.show();
//		List<Employee> lst = new ArrayList<Employee>();
//		lst.addAll(
//				Arrays.asList(
//				new Employee("Dhruv", 101),
//				new Employee("Abhi", 102),
//				new Employee("Yaman", 103),
//				new Employee("Rishi",104)
//				));
//       System.out.println(lst);
       
       //Collection is API where different datastructure are store like:- LinkedList, ArrayList, etc.
       // Collections is a class
       
       /*Comparator<Employee> comp = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			// TODO Auto-generated method stub
			return e1.getEmpName().compareTo(e2.getEmpName());
		}
    	   
       };
       Collections.sort(lst, comp);
       System.out.println(lst);*/
       
       
       /* Sort using anonymous class
       Collections.sort(lst, new Comparator<Employee>() {

		public int compare(Employee e1, Employee e2) {
			 
			return e1.getEmpName().compareTo(e2.getEmpName());
		}
   	   
      });
       System.out.println(lst); */
       
    /*   // Sort using lambda Expression
       Collections.sort(lst,(Employee e1, Employee e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
        Collections.sort(lst,( e1, e2) -> e1.getEmpName().compareTo(e2.getEmpName()));
       System.out.println(lst); */
       
       // Double Colon Method reference  syntax -> Class_Name :: Method_name
       
//       Collections.sort(lst,Comparator.comparing(Employee :: getEmpName));
//       System.out.println(lst);
   
       
	}

}
