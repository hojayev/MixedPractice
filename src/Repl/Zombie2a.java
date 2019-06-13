package Repl;

import java.util.Arrays;

public class Zombie2a {
	public static void main(String[] args) {
		
		
		int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
	    //TODO. Write you code below this line. 
	    
	    int x = 0;
	    int count = 1;
	    int [] temp = new int [8]; 
	    
	    
	    for (int i = 0; i < temp.length; i++)
	    	temp[i]= inhabitants[i];
	    
	        
	    while (count>0)
	    {
	      count = 0;
	      
	      System.out.println("Day " +x +" " + Arrays.toString(inhabitants));
	      x++;
	      for (int i = 0; i < inhabitants.length; i++)
	      {
	        
	    	   
	    	 temp [i] = inhabitants [i]; 
	    	  
	        if((i==0 && inhabitants[i+1]==0)|| (i==(inhabitants.length-1) && inhabitants[i-1]==0))
	        {
	        inhabitants[i] = inhabitants[i]/2;
	        }
	        
	        else if ((i!=0 && i!=(inhabitants.length-1)) && (temp[i-1]==0 || inhabitants[i+1]==0))
	        { 
	        	
	        
	          inhabitants[i] = inhabitants[i]/2;
	        }
	        
	        
	    
	        
	        count+=inhabitants[i];
	      
	      }
	    }
	    
	    System.out.println("Day " + x +" " + Arrays.toString(inhabitants));
	    System.out.println("---- EXTINCT ----");
	    
		
		
		
	}

}
