package hashPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class NonRepeatingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {1,2,3,4,1,2,3,4,5,1,2,3,4,5,6,7,8,8,8,8,9};
		ArrayList<Integer> arrl = new ArrayList<Integer>(Arrays.asList(arr));
		HashSet<Integer> hs = new HashSet<Integer>(arrl);

		System.out.println(arrl);
		System.out.println(hs);
		
	}

}
