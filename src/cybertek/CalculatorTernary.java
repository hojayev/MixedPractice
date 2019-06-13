package cybertek;

import java.util.Scanner;

public class CalculatorTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		System.out.println("Enter operator:");
		String operator = input.next();
		
	  // int result = (operator.equals("*")?num1*num2:operator.contentEquals("-")?num1-num2:operator.contentEquals("/")?num1/num2:operator.contentEquals("+")?num1+num2:0)
	   System.out.println((operator.equals("*")?num1*num2:operator.equals("-")?num1-num2:operator.equals("/")?num1/num2:operator.equals("+")?num1+num2:"Not available"));
	
	   
	   
	   
	}

}
