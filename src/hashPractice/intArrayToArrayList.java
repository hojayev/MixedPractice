package hashPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,4,1,2,3,4,5,1,2,3,4,5,6,6,7,7,8,8,8,8,9};
//		List arrl = Arrays.asList(arr);
//		
//		System.out.println(arrl.toString());
		
		//Unique number
		int unique=0;
		int count =0;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[i]==arr[j])
					count++;
			}
			System.out.println(arr[i] + " is repeated " + count + " times");
			if (count==1) {
				unique=arr[i];
			}
		
		}
		
		System.out.println(unique);
		
	}

}
