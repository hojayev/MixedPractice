package cybertek;

import java.util.Scanner;

public class Exercise6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cs = new Scanner(System.in);
		System.out.println("Enter amount you would like to invest");
		double amount = cs.nextDouble();
		
		System.out.println("Enter interest rate");
		double interest = cs.nextDouble();
		
		System.out.println("How many years would you like to invest?");
		int years = cs.nextInt();
		
		System.out.println("The amount invested: " + amount);
		System.out.println("Annual interest rate: " + interest);
		
		System.out.println("Years     Total");
		
		if (years <= 0) {
			System.out.println("  0      " + amount);
		}
		else {	
		for (int i = 1; i<=years; i++)
		{
		System.out.println( i + "    " + futureInvestmentValue(amount, interest, i));
		}
		}
	}

public static double futureInvestmentValue (double amnt, double intr, int yrs)
{	
	double total = amnt;
	
	
	

	
		total = amnt*Math.pow((1+intr/12/100),(yrs*12));
		
	

	return total;
}
}
