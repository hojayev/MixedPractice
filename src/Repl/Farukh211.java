package Repl;

import java.util.ArrayList;

public class Farukh211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Ab,c,de!$";
		String str = word.replaceAll("[^a-zA-Z]", "");
		String reversed = "";
		for(int i=str.length()-1; i>=0; i--) reversed += str.charAt(i);
		
		int j=0;
		for(int i=0; i<word.length(); i++) {
		  if((word.charAt(i)>='A' && word.charAt(i) <='Z') || (word.charAt(i)>='a' && word.charAt(i) <='z')) {
		  word = word.substring(0,i)+reversed.charAt(j)+word.substring(i+1);
		  System.out.println(word);
		  j++;
		  }
		}
		
		System.out.println(word);
	}

}
