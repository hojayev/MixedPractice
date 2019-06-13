package cybertek;

import java.util.Scanner;

public class Exercise2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter v0 ");
		double v0 = input.nextDouble();
		System.out.println("Enter v1");
		double v1 = input.nextDouble();
	    System.out.println("Enter time ");
	    double t = input.nextDouble();
	    
	    double acceleration = (v1-v0)/t;
	    
	    System.out.println("Average acceleration is "+ acceleration);
	    
	}

}
