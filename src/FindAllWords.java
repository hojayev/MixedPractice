import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;



public class FindAllWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan = new Scanner(System.in);
		
		

		ArrayList <Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.remove(Integer.valueOf("2"));
		System.out.println(numbers);
		
		
		int arr 
		
		
		
		 String str = "java kava ava " ;
		    
		    String target = "ava" ; 
		    
		    //int firstIndex = str.indexOf( target ); 
		    int laststIndex = str.lastIndexOf( target );
		    
		    int index = -1 ; 
		    
		    while( index<= laststIndex   ) {
		      
		      index = str.indexOf(target, index); 
		      System.out.println("Found at index : "+ index);
		      //index = index + 1 ; 
		      index = index + target.length() ; 
		    }
		
		
	}

}
