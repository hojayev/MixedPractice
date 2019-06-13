package cybertek;

import java.util.Scanner;

public class ScannerIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = input.nextLine();
		
		System.out.println("Your name is "+ name);
		
		System.out.print("Please enter your Last name: ");
		String lname = input.nextLine();
		
		System.out.println("Your name is "+ lname);
	}

}


//name 
//lastname
//city 
//country
