package cybertek;

public class Excercise6_12 {

	public static void main(String[] args) {
		
	
		printChars('1','Z', 10);
	
	
	}

	public static void printChars (char ch1, char ch2, int numberPerLine) {
		
		int x = 1;
		for (int i = ch1; i<=ch2; i++) {
			
			System.out.print((char)i);
			
			if(x%numberPerLine==0) {
				System.out.println("");
			}
			
			x++;
		}
		
	}
	
	
	
}
