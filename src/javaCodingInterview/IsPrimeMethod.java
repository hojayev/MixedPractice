package javaCodingInterview;

public class IsPrimeMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(isPrime(12));
		System.out.println(isPrime(15));
		System.out.println(isPrime(97));
		
		for (int i = 0; i <= 100; i++) {
			System.out.print(isPrime(i)? i + " ": "" );
		}
	
		
	}

	public static boolean isPrime(int a) {
		if(a == 0 || a ==  1) return false;
		
		if (a==2 || a == 3) return true;
		
		for (int i = 2; i <= Math.sqrt(a)+1; i++) {
			if(a%i==0) return false;
		}

		return true;
	}
	
}
