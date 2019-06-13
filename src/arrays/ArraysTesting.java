package arrays;

import java.util.Arrays;


public class ArraysTesting {
public static void main(String[] args) {
	
	int[] arr = {1, 2, 3, 4, 5 };
	int[] arr2 = {1, 3, 2, 4, 5 };
	
	Arrays.sort(arr); 
	Arrays.sort(arr2);
	System.out.println(Arrays.equals(arr,arr2));
	
	
}
	
	
}
