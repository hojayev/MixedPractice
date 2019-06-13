package cybertek;

import java.util.Scanner;

public class Exercise2_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter side of the hexagon");
		
		double side = input.nextDouble();
		
		double area = 3*Math.sqrt(3)*Math.pow(side, 2)/2;
		
		System.out.println("Area is " + area);
	}

}
