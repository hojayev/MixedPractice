package cybertek;

import java.util.Arrays;



public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] arr = new int [2][5];
		
		String abdString= "hello";
		
		System.out.println(Arrays.deepToString(arr));
		
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		
		for (int i = 0; i<arr.length; i++) {
			for(int j = 0; j< arr[1].length;j++) {
				arr[i][j] =2;
				System.out.println(Arrays.deepToString(arr));
			}
		}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//
//		String word = "Java is fun true";
//		
//		// fun is Java
//		
//		String[] arr = word.split(" ");
//		
//		System.out.println(Arrays.toString(arr));
//		
//
//		
//		
//		for(int i=arr.length-1; i>=0; i--) {
//			System.out.println(arr[i]);
//		}
//		
//		
//		String reverse ="";
//		
//		for(int i = word.length()-1; i>=0; i--) {
//			reverse += word.charAt(i);
//		}
//		
//		System.out.println(reverse);
//		
	}

}
