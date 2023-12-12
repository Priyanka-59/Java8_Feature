package com.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Stream :- Stream is a sequences of element which provide same completion operation
 //means it provide the operation which we use on collection
interface MyPredicate<T>{
	boolean operation(T t);
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Car> carList = Arrays.asList(
				new Car("Toyota", "White", 300000),
				new Car("BMW", "Black",750000),
				new Car("Marcedes Benz", "Yellow", 600000),
				new Car("Hyundai Honda","White", 500000));
				
		System.out.println(carList);
		// Predicate is Functional Interface while always return boolean
		//Predicate<Car> p = x -> x.getPrice() > 500000;
		//Predicate<Car> p = x -> x.getColor().contains("M");
		MyPredicate<Car> p = x -> x.getColor().contains("M");
		
		for(Car car : carList) {
				//if(p.test(car))
			    if(p.operation(car))
			
					System.out.println(car.getName());
			}
	}

}
