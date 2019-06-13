package Repl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Repl221 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> r = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		
		System.out.println(twoTimes(r));
	}

	

	
	
	
	
	
	
	
	
	
	
	
	public static ArrayList<Integer> twoTimes (ArrayList<Integer> r){
	  int size = r.size();
	  ArrayList<Integer>  newList = new ArrayList<>(r); 
	  for (int i = 0; i<newList.size(); i+=2){
	    newList.add(i,newList.get(i));
	    
	    
	  }
	    
	  return newList;
	}
}
