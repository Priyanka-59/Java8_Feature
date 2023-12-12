package com.anonymous;
public class Main {

	public static void main(String[] args) {
		
/*		
		// creating obj of anonymous class we terminate it at last as this is single line code
		Anonymous obj = new Anonymous() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println(" I am here from an Anonymous obj");
			}
			
		};
		// calling anonymous method
		obj.show();
			*/
		
		
		
		// Using Lamda Expression -> It provide limited and readable code (lambda is not a keyword)
		// we can only achieved the lambda expression using Functional interface 
		// A functional interface is that having only one and one method.
		// in lambda expresson we can remove curly braces if there is only 1 statement
		// i.e
		
		  // Anonymous lambda = ()-> System.out.println(" I am here from an Lambda obj");
		   Anonymous lambda = ()-> System.out.println(" I am here from an Lambda obj but by fi");
		   lambda.show();
		   
		  
	}

}
