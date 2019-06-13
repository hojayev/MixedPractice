package cybertek;

import java.util.Scanner;

public class Repl23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String item1, item2, item3, report;
	    double price1, price2, price3, totalPrice;
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter Item1 and its price:");
	    item1 = sc.nextLine();
	    price1 = sc.nextDouble();
	    
	    sc.nextLine();
	    
	    System.out.println("Enter Item2 and its price:");
	    item2 = sc.nextLine();
	    price2 = sc.nextDouble();
	    
	    sc.nextLine();
	    System.out.println("Enter Item3 and its price:");
	    item3 = sc.nextLine();
	    price3 = sc.nextDouble();
	    
	    totalPrice = price1 + price2 + price3;
	    
	    System.out.println("Item1: " + item1+ " Price: "+ price1+ " Item2: " + item2 + " Price: "+ price2 +" Item3: "+ item3 + " Price: " + price3);
	    System.out.println("Total price: " + totalPrice);
	    
	
	
	
	}

}
