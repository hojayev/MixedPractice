package cybertek;

import java.util.Scanner;

public class Amazon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Amazon!");
		System.out.println("Please enter the price: ");
		double price = input.nextDouble();
		
		System.out.println("Write true if you have prime membership, otherwise type false");
		boolean prime = input.nextBoolean();
		
		if (prime) {

			System.out.println("You get free shipping, your total price is "+ price);
			
		}
		else if (price >=35) {
			System.out.println("You get free shipping, your total price is "+ price);
			
		}
			
		else {
			
			System.out.println("Shipping is $5, your total is " +(price + 5));
		}
	}

}
