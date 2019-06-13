package ProofOfConcept;

public class FirstLastString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "apple";
	System.out.println( word.substring(0,1).replaceAll("[aeiouAEIOU]","").isEmpty());	
		
	}

}
