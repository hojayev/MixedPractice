package cybertek;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] abc = new int [4][];
		
		int[] arr = {1,2,3};
		
		abc[0]= arr;

		System.out.println(Arrays.toString(abc[0]));
		System.out.println(Arrays.toString(abc[1]));
		
		String names = "Java.is.fun";
		String[] abcd = names.split(".");
		
		System.out.println(Arrays.toString(abcd));

	
		int num = 12345;
		
		String reverse = ""+num;
		
		num = Integer.parseInt(reverse.reverse());
		
		
		
	}

}


//numbers[i] = numbers[i] + numbers[numbers.length-1-i];
//numbers[numbers.length -1-i] = numbers[i] - numbers[numbers.length-1-i];
//numbers[i] = numbers[i] - numbers[numbers.length-1-i];