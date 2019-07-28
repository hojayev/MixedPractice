package hashPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class UniqueLettersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "This the very short sentence for practice";
		String [] arr = word.toLowerCase().replace(" ", "").split("");
		
		System.out.println(Arrays.toString(arr));
		HashSet<String> hs = new HashSet<String>(Arrays.asList(arr));
	
		System.out.println(hs);
		String output = "";

		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			output +=it.next();
		}
			
			
//		for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
//			output += (String) iterator.next();
//			
//		}
			
		System.out.println(output);
		
		
	}

}
