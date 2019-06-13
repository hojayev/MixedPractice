package arrays;

import java.util.Arrays;

public class KeepAddingToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] arr = { "Sparta",  " is ", " great "};
		
		arr = Arrays.copyOf(arr, arr.length+1);
		
		arr[arr.length-1]= "!";
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}


