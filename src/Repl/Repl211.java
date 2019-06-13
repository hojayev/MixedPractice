package Repl;

import java.util.Arrays;

public class Repl211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "-!A-ab-c";
		String[] arr = word.replaceAll("[^a-zA-Z]","").split("");
		String special = word.replaceAll("[a-zA-Z]","");
		int x = arr.length-1;
		String rev = "";
		
		for (int i = 0; i<word.length(); i++) 
		{
		  if(!special.contains(word.substring(i, i+1)))
		  {
			  rev += arr[x--];			 
		  }
		  else rev+= word.charAt(i);
		}
		
		
		System.out.println(rev);
	}

}
