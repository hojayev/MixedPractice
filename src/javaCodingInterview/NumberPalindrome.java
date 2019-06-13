package javaCodingInterview;

public class NumberPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
		int original = num;
		int reversed = 0;
		
		while (num!=0) {
			reversed = reversed*10+num%10;
			num/=10;
		}
		System.out.println(reversed);
		System.out.println(original==reversed);
	}

}
