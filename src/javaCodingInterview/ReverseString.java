package javaCodingInterview;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "We are almost there, keep pushing!";
		
		
		System.out.println(new StringBuilder(str).reverse().toString());
		
		
//		String output= "";
//		for (int i = 0; i < str.length(); i++) {
//			output +=str.charAt(str.length()-1-i);
//		}
//		System.out.println(output);
	}

}
