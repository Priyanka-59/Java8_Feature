package com.defaultMethod;

//public class C implements Diamond , B{
public interface C extends Diamond , B{

	@Override
	//1. void show(); // remove collision resolve diamond issue 
	 default void show() {
		System.out.println(" Inherited from a and b");
	}
	
//	public void show() { having same prototype
	
//		// TODO Auto-generated method stub
//		
//		System.out.print("Here is a resolvbility of Diamond problem");
//		
//	}
	
	

}
