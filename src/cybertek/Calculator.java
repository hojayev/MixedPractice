package cybertek;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		System.out.println("Enter operator:");
		String operator = input.next();
		
		switch (operator) {
		
		case "*":
			System.out.println(num1*num2);
			break;
		
		case "/":
			System.out.println(num1/num2);
			break;
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		default:
			System.out.println("Operator unavailable right now, try again later");
			
		
		
		
		}
		
	}

}
