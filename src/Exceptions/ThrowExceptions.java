package Exceptions;

public class ThrowExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	try {	
		System.out.println("Hello");
		throw(new ArithmeticException());
		
	}catch (ArithmeticException e) {
		System.out.println("Please check the code, there is an exception");
		
	}	
	}

}
