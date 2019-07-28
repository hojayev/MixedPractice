package Repl;

import java.util.Arrays;

public class Repl226 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			int start = 100;
			int numberOfEntries = 5;
		
	       int[] result = new int[numberOfEntries];
	       
	       int x=0;
	       while(x<result.length){
	         if(isPrime(start++)){
	           result[x++]=start-1;
	         }
	       }
	       System.out.println(Arrays.toString(result));
		
		
	}

	
    public static  boolean isPrime(int number) {
        
        //TODO:
        if(number<=1) return false;
        
        for (int i = 2; i<number;i++){
          if(number%i==0) return false;
        }
        return true;
       
    }
	
}
