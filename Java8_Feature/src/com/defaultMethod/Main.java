package com.defaultMethod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Car();
		v1.horn();
		//v1.speedoMeter(); // using default keyword
		Vehicle.speedoMeter(); // using static keyword
		
		v1 = new Bike();
		v1.horn();
		//v1.speedoMeter(); // using default keyword
		Vehicle.speedoMeter();
		
	 // new C().show(); // show no problem of ambiguity issue becoz prototype is same
	  
		

	}

}
