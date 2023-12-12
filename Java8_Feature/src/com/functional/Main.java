package com.functional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class Main {
	
	

	// Predicate --> boolean test(T obj)
	// BiPredicate --> boolean test (T a1, T a2)
	// Consumer --> void accept(T a)
	// BiConsumer --> void accept(t a1, T a2)
	// Function --> predicate is a type of fxn, in fxn we have to defined a return type E apply(t ob1) 
	// BIFUNCTION --> E apply(T obj1, T obj2)
	// Supplier  --> to return some value E get()
	// UnaryOperator --> e apply(t obj)
	// BinaryOperator --> E Apply(T Obj1 , T obj2)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*	Predicate<Integer> p = x -> x>50;
			System.out.println(p.test(15)); 
		*/
		
	/*	BiPredicate<Integer, Integer> b = (x,y) -> x>y;
		System.out.println(b.test(15,87));
		
	*/

		 
		/*	 Consumer<String> c = x -> System.out.print(x.length());
		 c.accept("Hello Krishna ji ");
		 List<Integer> lst = Arrays.asList(4,56,2,4,7,8,4,67);
		 Consumer<Integer> c1 = x -> System.out.println(x);
		 lst.stream().forEach(c1);
		  */
		
		 
		
		/* BiConsumer<String, String> c1 = (x,y) -> System.out.println(x + ":" +y);
		 c1.accept("Hello","World");
		 
		// EXample of Biconsumer
		  Map<Integer, String> m = new HashMap<>();
		  m.put(101, "RAM");
		  m.put(102, "Kanah");
		  m.put(103, "Sita");
		  
		  m.forEach((x,y) -> System.out.println(x+y)); */
		  
		  
		/* // Boolean is a return type
    Function<Integer, Boolean> f = x-> x>50;
    System.out.println(f.apply(105));*/
		

		/*		BiFunction<Integer, Integer, String> f = (s,t) -> s+" " +t;
		System.out.println(f.apply(3,4)); */
		

		/*Supplier<String> s = () -> " JUST return the type defined";
		System.out.println(s.get()); */
		

		/*// Unary operator take a parameter input and return the generic
		UnaryOperator<String> u = x -> "Hello";
		System.out.println(u.apply("ProgRank")); */
		
		// Take 2 parameter but we can take 1 it accept it by default
		BinaryOperator<String> b = (x,y) -> x + y;
		System.out.println(b.apply("Teri Marzi", "Toh Kya"));
		/* */ 
		
		
		
		

	}

}
