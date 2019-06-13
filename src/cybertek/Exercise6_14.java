package cybertek;

import java.util.Random;
import java.util.Scanner;

public class Exercise6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("What size matrix do you want? ");
		
	int n =sc.nextInt();
      printMatrix(n); 
	}
	
	public static void printMatrix (int n)
	{
		Random rand = new Random();
		for(int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++ )
			{
				System.out.print(rand.nextInt(2)+" ");
			}
			
			System.out.println("");
		}
		
		
		
		
	}

}
