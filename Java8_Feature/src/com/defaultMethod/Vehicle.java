package com.defaultMethod;

public interface Vehicle {
	void horn();
	
	// if declare any method then we need to use static and default method
	// by using static keyword we can used direct method using interface name i.e Vehicles.Method_name
	static void speedoMeter() {
		System.out.println("Common Functionality..\n");
	}
	
	// by using default method we have to create a obje and then call a method and we can override this method 
	// Why we use default keywords
	/*default void speedoMeter() {
		System.out.println("Common Functionality");
	}*/

}
