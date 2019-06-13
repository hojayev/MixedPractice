package arrays;

import java.util.Arrays;

public class CopyOfTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		
		int [] arr2 = new int [6];
		
		int [] arr3;
		
		arr2 = Arrays.copyOf(arr, arr.length);
		
		System.out.println(Arrays.toString(arr2));
		
		arr3 = Arrays.copyOfRange(arr, 0, arr.length);

		System.out.println(Arrays.toString(arr3));
		
		
		
		
		
		
	}

}
