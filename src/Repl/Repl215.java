package Repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Repl215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 ArrayList<Integer>  arr = new ArrayList<>();
		    Integer[] nums = new Integer[]{1,1,2,3};
		    arr.addAll(Arrays.asList(nums));
		    
		   for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i)==1) {
				arr.remove(i);
				i--;
			}
		}
		   
		   System.out.println(arr);
		    
	}

}
