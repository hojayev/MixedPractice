package cybertek;

import java.util.Scanner;

public class Bigger_number_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two number");
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		String bigger = (a>b)? "bigger":"smaller";
		
		
		switch ( bigger) {
		
		case "bigger":
			System.out.println(a*a);
			break;
			
		case "smaller":
			System.out.println(b*b);
			break;
		
		
		
		}
		
		
	}

}
