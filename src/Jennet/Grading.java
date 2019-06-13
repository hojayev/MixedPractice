package Jennet;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println ("Please enter your grade");
		Scanner input = new Scanner (System.in);
		int grade = input.nextInt();
		
		String letter = "invalid";
		if (grade >100)
		{
			System.out.println ("Invalid grade");
			
		}
		
		else if (grade >= 90)
		{
			letter = "A";
		}
		
		
		else if (grade >=80)
		{ 
			letter = "B";
		}
		else if (grade >= 70)
		{
			letter = "C";
		}
		
		else 
		{
			letter = "F";
			
		}
		System.out.println ("Your grade is " + letter );
		
		
	}

}
