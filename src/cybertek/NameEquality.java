package cybertek;

import java.util.Scanner;

public class NameEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter item name:");
		String item = input.next();
		
		System.out.println("Enter the price");
		double price = input.nextDouble();
		
		
		System.out.println("Do you have a discount? yes or no");
		
		String haveDiscount = input.next();
		double discountAmount = 0 ;  
		
		if (haveDiscount.equalsIgnoreCase("yes")) {    
			
			System.out.println("What type of discount do you have? $ or %");
			
			String discountType = input.next();
			 
				switch (discountType) {
				
				case "$":
					
					System.out.println("Enter you discount amount:");
					discountAmount = input.nextDouble();
					break;
				
				case "%":
					System.out.println("Enter discount percentage:");
					double percent = input.nextDouble();
					discountAmount = price*percent/100;
					break;
					
				default:
					System.out.println("No discount for you!");
					
				}
 			 
		
		}
		
		
		
		
		System.out.println("What is the tax rate?");
		double taxRate = input.nextDouble();
		
		double taxAmount = (price-discountAmount) * taxRate/ 100;
		
		//double TotalAmount = price + taxAmount;
		
		System.out.println(item + " costs "+ price + " and tax amount is " + taxAmount + " at tax rate of " + taxRate);
		System.out.println("Discounted price it " + (price - discountAmount));
		
		System.out.println(" Total amount is " + (price - discountAmount + taxAmount));
		
		
		
	}

}
