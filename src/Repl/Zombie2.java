package Repl;

import java.util.Arrays;

public class Zombie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	    Scanner input = new Scanner(System.in);
//	    int[] inhabitants = new int[8];
//	    for(int i=0; i<inhabitants.length; i++) {
//	      inhabitants[i] = input.nextInt();
//	    }
	    
		
		int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
	    //TODO. Write you code below this line. 
	    
		int day=0;
	    int max=inhabitants[0];
	     System.out.println("Day "+day++ +" "+ Arrays.toString(inhabitants));
	    while(max>0){
	      for(int k=1;k<inhabitants.length;k++){
	      if (inhabitants[k]>=max) max=inhabitants[k];}
	      for(int j=0;j<inhabitants.length;j++){
	        if(j==0&&inhabitants[j+1]==0 )inhabitants[j]/=2;
	        else if(j==inhabitants.length-1&&inhabitants[j-1]==0 )
	        inhabitants[j]/=2;
	        else if ((j>0 && j<inhabitants.length-1)&&
	        (inhabitants[j-1]==0||inhabitants[j+1]==0 ))
	        inhabitants[j]/=2;
	      }
	     System.out.println("Day "+day+++" "+ Arrays.toString(inhabitants)); 
	      max/=2;
	    }
	     
	   System.out.println("---- EXTINCT ----");
		
		
		
		
	}

}
