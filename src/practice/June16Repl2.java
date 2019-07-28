package practice;

import java.util.ArrayList;
import java.util.Arrays;

public class June16Repl2 {

	
	//Create class without main method and copy everything in there
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> one = new ArrayList<String>(Arrays.asList("a","b","c"));
		ArrayList <String> two = new ArrayList<String>(Arrays.asList("d","e","f"));
		ArrayList <String> three = new ArrayList<String>(Arrays.asList("j","h","i"));
		
		ArrayList<ArrayList<String>> letters = new ArrayList<ArrayList<String>>();
		letters.add(one);
		letters.add(two);
		letters.add(three);
		
		if(printList(letters).equals("abcdefjhi"))
			System.out.println("Congrats you are done!");
		else 
			System.out.println("Try again");
		
	}

	
	  public static String printList(ArrayList<ArrayList<String>> nestedList) 
	  { //Add your code here
		  String output="";
		  for(ArrayList<String> each1: nestedList)
		    for(String each :each1)
		      output+=each;
		      
		  return output;
		  
	  }
	
}




