package Repl;

public class Repl160 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String one = "skill", two = "killer";
	    int x = 0;
	    String merge = "";
	    while ( x<one.length() && x<two.length() )
	    {
	      merge = merge + one.charAt(x)+two.charAt(x); 
	      
	      x++;
	    }
	    
	    merge += (one.length() >= two.length()) ? one.substring(x) : two.substring(x);
	    
	    //return merge;
	    System.out.println(merge);
	}

}
