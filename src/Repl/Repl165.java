package Repl;

import java.util.Arrays;

import cybertek.forLoopOCA;


public class Repl165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
		String str = "java";
		
		int x = 0;
	    String unique = "";
	    while (x<str.length())
	    {
	      if(!unique.contains(str.substring(x,x+1)))
	      unique+=str.substring(x,x+1);
	      x++;
	      
	    }
	    
	    
	    unique += ((!unique.contains(str.substring(x)))? str.substring(x):"");
		
		System.out.println(unique);
		
		String a = "race car";
		System.out.println(isPalindrome(a));
		 
		int[][] nums= {{1,2,3,4},{5,6,7,8},{9,0,1,2}};
		String aStr = Arrays.deepToString(nums);
		
		System.out.println(Arrays.deepToString(nums));
		
		
		
		
	}

	public static boolean isPalindrome(String str)
	{
		boolean Pal = true;
		str = str.replaceAll(" ","");
		for( int i = 0; i<str.length()/2; i++)
		{
			if(str.charAt(i)!=str.charAt(str.length()-1-i))
				Pal = false;
				break;
				
		}
				
		return Pal;
		
	}
	
	
	
}
