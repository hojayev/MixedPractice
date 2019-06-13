package hackerrank;

import java.util.Scanner;

public class StringTokenEsra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         	int[] [] array = new int [2][];
		
		   Scanner scan = new Scanner(System.in);
	        String s = scan.nextLine();
	        
		
	        if (s.equals("")) {
	        	System.out.println("0");
	        	System.exit(0);
	        }
	        	
	        	
        String[] items = s.trim().split("[ !,?.\\_'@]+");


        
        
        System.out.println(items.length);
        

        for(String item: items){
            System.out.println(item);
        }


		
		
		
	}

}
