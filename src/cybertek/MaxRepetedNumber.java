package cybertek;

public class MaxRepetedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int count = 0;
		 int max = 0;
		 int num = 0;
		    
		    int[] myArray = {1, 1, 2, 6, 5, 4, 3, 4, 6, 7, 3, 4, 2, 7,7,7,7,7, 6,6,6,6,6,5,5,5,5,5,1,1,1,1,9,9,9,4,4,4,9,9,7,7,7,7,9,9,9,9,8,8,4,4,4,6,8,8,7,7,7,6,8,8,8,5,4,4,8,8,8,2, 3, 4, 4, 4, 8, 9, 9};
		    
		    for(int i=0; i<myArray.length; i++) {
		    	count=1;
		      for(int j=i+1; j<myArray.length; j++) {
		        if(myArray[i]==myArray[j])
		          count++;
		        
		        
		      } 
		      
		      System.out.println("Number is " + myArray[i] + " and count is " + count );
		      
		      if (count>max) {max = count;  num =myArray[i];   }
		    }

		   System.out.println(num + " is the number repeated the most, " + max + " times");
	}

}
