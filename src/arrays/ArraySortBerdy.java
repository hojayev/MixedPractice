package arrays;

import java.util.Arrays;

public class ArraySortBerdy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {4,5,3,2,1};
		
		int j;
		int temp;
		for(int i=1; i<arr.length; i++)
		{	j=i;
			while ( j>0 && arr[j]<arr[j-1]  )
			{
				temp = arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				j--;
				
				System.out.println(Arrays.toString(arr));
			}
		}
	}

}
