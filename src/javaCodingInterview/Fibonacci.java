package javaCodingInterview;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int elements = 10;
		int a = 0;
		int b = 1;
		int total = 0;
		for (int i = 2; i <= elements; i++) {
			total = a+b;
			a = b;
			b = total;
			
			System.out.print(total + "");
		}
		
		
		
	}

}
// Does not print first two, fix this