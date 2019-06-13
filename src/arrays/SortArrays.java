package arrays;

import java.util.Arrays;

public class SortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,3,1,5,4,7,6};
		
		int [] arr2 = Arrays.copyOf(arr, 7);
		Arrays.sort(arr2);
		
		//Arrays.parallelSort(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(Arrays.binarySearch(arr,5));
		
		System.out.println(Arrays.compare(arr, arr2));
	}

}
