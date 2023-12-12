package com.parallel;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> lst = Arrays.asList(1,2,3,4,5);
		
		//if we want to perform stream operation concurrent than we have to go with parallel Stream
		//lst.stream().parallel().forEach(System.out :: println);
		
		lst.parallelStream().forEach(System.out :: println);
		
	}

}
