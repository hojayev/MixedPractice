package ProofOfConcept;

import javax.sound.midi.Soundbank;

public class Arralist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentence = "laptopandlaptop";
		String target = "laptop";
		
	    int count = 0;
	    
	   while (sentence.contains(target)) {
	    	sentence = sentence.replaceFirst(target, "");
	    	count++;
	    	System.out.println(sentence);
	    	System.out.println(count);
	   }
	    
//	    while (sentence.indexOf(target)>=0)
//	    {
//	    	sentence = sentence.substring(sentence.indexOf(target)+1);
//	    	count++;
//	    	
//	    }
//	    
	  //  return count==2;
	    
//	    for(int i=0; i<sentence.length()-target.length();i++)
//	    {
//	      if(sentence.substring(i,i+target.length()).equalsIgnoreCase(target)){
//	        count++;
//	      }
//	    }
	    
	    System.out.println(count==2);
	    
//	    if(count == 2) return true;
//			return false;
//		
	}

}