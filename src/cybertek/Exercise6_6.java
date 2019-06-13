package cybertek;

import java.util.Scanner;

public class Exercise6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cs = new Scanner (System.in);
		System.out.println("enter a number ");
		int n = cs.nextInt();
		
		displayPattern(n);
		
	}

	
	public static void displayPattern (int n )
	{
		
		
		for (int i = n; n>0; i--)
		{   
			int m = 0;
			for (int j = 1; j<i-1; j++)
			{
				System.out.print(" ");
				m = j; 
			
			}
		
			for (int k = n - m;k>0; k-- )
			{
				System.out.print(k);
			}
			
			System.out.println("");
		
		}
		
	}
	
	
}
