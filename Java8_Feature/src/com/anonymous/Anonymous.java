package com.anonymous;

// Anonymous class is inner class having no name, we can provide the implementation of this using creation of object
// we can use annotation i.e FUNCTIONAL INTERFACE

@FunctionalInterface
public interface Anonymous {
	
	void show();
	// void printNum(); // we can only use 2 method in Interface not in Functional Interface
	// if an interface having n no. of static and default method then also it is called functional interface
	// and we cAN DEFINE THESE METHOD IN INTEREFACE
	static void print() {
		System.out.println(" I am from static method but FI");
	}
	
	default void display() {
		System.out.println(" I am from default method but FI");
	}
	
	

}

// now to use this method we need to provide implementation using another class and create its method

//  i.e 

/*class Test implements Anonymous{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("I am here from the implements Methods");
		
	} 
}*/
