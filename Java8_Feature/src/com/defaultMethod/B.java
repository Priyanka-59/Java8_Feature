package com.defaultMethod;

public interface B {
	default void show() {
		
		System.out.println("FRom b");
	}

}
