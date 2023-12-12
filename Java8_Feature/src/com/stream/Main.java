
//Collection have 2 API that is Stream and Parallel Stream
// stream are of 2 types i.e intermediate and terminal 
package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IntStream.range(1, 11).forEach(x ->System.out.print(x + " ") );
		//IntStream.range(1, 6).forEach(System.out :: println);
	/* num  = IntStream.iterate(2, x -> x+1);
		num.limit(10).forEach(System.out :: print);
		*/
	/*	
		long c = Stream.of(10,20,33,5,44,45,55,1).filter(x -> x>20)
		.count();
		
		System.out.println(c);*/
		
	/*	long c = Stream.of("Java", "JavaScript", "Python", "Go", " dart").filter(x -> x.contains("J"))
				.map(String :: toUpperCase)
				.count();
				System.out.println(c);
		
                Stream.of("Java", "JavaScript", "Python", "Go", " dart")
				.filter(x -> x.contains("J"))
			    .map(String :: toUpperCase)
			    .forEach(System.out :: println);	
			    
	Stream.generate(Math :: random).limit(8)..forEach(System.out :: println);
			    
			    			*/
	/*	System.out.println(
		Arrays.asList("Java","JavaScript","Python", "GO")
		.stream() 
		.filter(x -> x.contains("J"))
		//.collect(Collectors.toList())
		.collect(Collectors.toSet())
		); */
		
//		List<Student> lst = new ArrayList<>();
//		lst.add(new Student ("Raj", Subjects.SCIENCE,45));
//		lst.add(new Student ("Rajiv", Subjects.MATH,35));
//		lst.add(new Student ("Sneha", Subjects.SCIENCE,29));
//		
//		System.out.println(lst.stream().collect(Collectors.toMap(Student :: getName, Student :: getSub)));
		
		/*
		List<Student> lst1 = new ArrayList<>();
		lst1.add(new Student ("Raj", Subjects.SCIENCE,45));
		lst1.add(new Student ("Rajiv", Subjects.MATH,35));
		lst1.add(new Student ("Sneha", Subjects.SCIENCE,29));
		lst1.add(new Student ("Rajiv", Subjects.ENGLISH,45));
		lst1.add(new Student ("Sneha", Subjects.ENGLISH,35));
		lst1.add(new Student ("Shasi", Subjects.LITERATURE,29));
		
		
		Map<String, List<Subjects>> map = new HashMap<>();
		
		lst1.stream().forEach(stu -> {
			map.computeIfAbsent(stu.getName(), x -> new ArrayList<Subjects>())
			.add(stu.getSub());
		});
		
		System.out.println(map);  */
	
		/*
		 List<String> lst2 = Arrays.asList("A","B");
		 List<String> lst3 = Arrays.asList("C","D","E");
		 List<String> lst4 = Arrays.asList("F","G");
		 
		System.out.println(Stream.of(lst2, lst3, lst4)
				.flatMap(List :: stream).collect(Collectors.toList()));
		 */
		
		/*Map<String, List<Integer>> map = new LinkedHashMap<>();
		map.put("one",Arrays.asList(1,2,3));
		map.put("two",Arrays.asList(4,5,6));
		 
		System.out.println(
				map.values().stream().flatMap(List :: stream)
				.collect(Collectors.toList()));
				
				*/
		
		List<Map<String, Integer>> lst = new ArrayList<Map<String, Integer>>();
		
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("one", 11);
		m1.put("two", 12);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("one", 13);
		m2.put("two", 14);
		
		lst.add(m1);
		lst.add(m2);
		
		//flatmap used to combine 2 list
		
		System.out.println(lst.stream().map(Map :: values)
				.flatMap(Collection :: stream).collect(Collectors.toList()));
		
	}

}
