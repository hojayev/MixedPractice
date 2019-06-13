package arrays;

import java.util.Arrays;

public class ArraySortErdem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5,4,3,2,1};
		System.out.println(Arrays.toString(arr));
		
		int temp = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[j]<arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					System.out.println(Arrays.toString(arr));
				//	System.out.println("i is " + i + " and j is " + j);
				}
				
				
			
			}
			
		}
		
		
	}

}
