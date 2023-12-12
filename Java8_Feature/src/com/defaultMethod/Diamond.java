package com.defaultMethod;


//to know whether the diamond problem exists or not  after 1.8
public interface Diamond {
	
	default void show() {
		System.out.println("FRom diamond");
	}

}
