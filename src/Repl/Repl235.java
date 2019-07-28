package Repl;

public class Repl235 {
	  public static void main(String[] args) {
		    char[] game1 = {
		      'X', 'X', 'X',
		      '4', 'O', '6',
		      '7', 'O', 'O'
		    };
		     char[] game2 = {
		      'O', 'X', 'X',
		      '4', 'O', 'X',
		      'O', 'O', 'O'
		    };
		    
		    char[] game3 = {
		      '1', 'O', 'X',
		      '4', 'X', 'X',
		      'X', '8', 'O'
		    };
		    
		    System.out.println(won(game1)); //Player X won
		    System.out.println(won(game2)); //Player O won
		    System.out.println(won(game3)); //Player X won
		  }
		  
		  public static String won(char[] x){
		    
		    if (x.length!=9) return null;
		    
		    for (int i = 0; i<x.length-2; i+=3)
		      if(x[i]==x[i+1] && x[i]==x[i+2])
		        return "Player " + x[i] + " won";
		    
		    for (int i = 0; i<x.length-5; i++)
		      if (x[i]==x[i+3] && x[i]==x[i+6])
		        return "Player " + x[i] + " won";
		        
		    if(x[0]==x[4] && x[0]==x[8])
		        return "Player " + x[0] + " won";
		   
		    if(x[2]==x[4] && x[2]==x[6])
		        return "Player " + x[2] + " won";
		   
		     return null;
		  }
}
