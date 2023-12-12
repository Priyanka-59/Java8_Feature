// Lambda expression by argument
package com.argument;


interface Operation{
	public int opt(int x, int y);
}
public class AsArgumrnt {

	
	public static void result (int x, int y , Operation obj) {
		System.out.println(obj.opt(x, y));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//result(50,8, (a,b) ->(a+b));
		
		// above statement works as 
		
		Operation obj = (a,b) ->(a+b);
		
		System.out.println(obj.opt(5, 8));
	}

}
