package cybertek;

import java.util.Scanner;

public class Warmup3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number:");

		int a = input.nextInt();
		
		System.out.println("Enter second number:");
		
		int b = input.nextInt();		
		
		System.out.println("a is " + a + " and b is "+b);
		
		
		
		b = a;
		
		a = b;
		
		System.out.println("a is " + a + " and b is "+b);
		
	}

}
