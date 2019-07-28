package Assessments;

import hashPractice.intArrayToArrayList;


public class MagicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 int sum1 = 0;
//		 int sum2 = 0;
//		 int sum3 = 0;
//		 int sum4 = 0;
//		 int sum5 = 0;
//		 int sum6 = 0;
//		 int sum7 = 0;
//		 int sum8 = 0;
		
		
		int[][] array = {
				{8,1,6},
				{3,5,7},
				{4,9,2}
			};
		
		
		
		
		for (int i = 0; i < array.length; i++) {
			
			 int sum1 = 0;
			 int sum2 = 0;
			 int sum3 = 0;
			 int sum4 = 0;
			
			
			for (int j = 0; j < array.length; j++) {
				sum1+=array[i][j];
				sum2+=array[j][i];
				sum3+=array[j][j];
				sum4+=array[array.length-1-j][j];
			}
		
				
			if (sum1!=sum3 || sum2!=sum4 || sum3!=sum4) {
				System.out.println(false);
				System.exit(0);
			}
			
			
		}
		
		System.out.println(true);

		
	}

}
