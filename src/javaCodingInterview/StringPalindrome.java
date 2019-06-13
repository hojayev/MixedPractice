package javaCodingInterview;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pal = "racecar";
		System.out.println(isPalindrome(pal));
		
	}

	private static boolean isPalindrome(String pal) {
		
		for(int i = 0; i<pal.length()/2; i++)
			if(pal.charAt(i)!=pal.charAt(pal.length()-1-i)) 
				return false;
		
		return true;
		
	}
	
	public static boolean isPalindrome1( String pal) {
		
	}
	
}
