package javaCodingInterview;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int topValue = 100;
		int count = 0;
		for (int i=2; i<=topValue; i++) {
			count = 0;
			for(int j = 2; j <=i; j++) {
				//System.out.println("i is " + i + " and j is "+j);
				if(i%j==0) count++;
			}
				
			if(count==1) System.out.print(i+" ");
		
		
		
		}

	}

}
