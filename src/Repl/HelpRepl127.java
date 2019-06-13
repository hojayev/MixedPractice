package Repl;

import java.util.Arrays;
import java.util.Scanner;

public class HelpRepl127 {

	public static int findShortest(String [] arr) {
       
		int shortest = arr[0].length();
			
		for(int i = 0; i < arr.length; i++){
            
            if(arr[i].length()<shortest){
              shortest = arr[i].length() ;
             
              }
            
       }
		return shortest;
	}
		
	
	public static int findCount(String[] arr, int letterNum) {
		
        int counter = 0; 
        for(int i = 0; i < arr.length; i++)
        {
        	if (arr[i].length()== letterNum)
        		counter++;      	
        }
		
		
		return counter;
		
	}
	
	
	public static String[] fillArray (String [] arr, int shortest, int fillNum) {
		
		String[] arr2 = new String[fillNum];
		
        int x = 0;
        for(int i = 0; i < arr.length; i++)
        {
        	if (arr[i].length()== shortest)
        	{
        		arr2[x]= arr[i];   // old. cat. ray
        		
        		x++;   				//x=1;	x=2, 
        	}
        
        	
        }
		
		
		
		return arr2;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        //Scanner scan = new Scanner(System.in);
        //String str = scan.nextLine();
        
        String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        
        String[] words = str.split(", ");
        
        int shortest = findShortest(words);
        
        int count= findCount(words, shortest);
        
        String[] arr = fillArray(words, shortest,  count);	
        
        Arrays.sort(arr);

        System.out.println(Arrays.deepToString(arr));
		
		
	}
}
	


