package Repl;

public class Repl194 {
	public static void main(String[] args) {
		
		
		String word1 = "listen";
		String word2 = "silent1";
		
		word1 = word1.toLowerCase().replaceAll("["+word1+"]", "");
		word2 = word2.toLowerCase().replaceAll("["+word1+"]", "");
		
		
		return (word1.length()!=word2.length()) ? false: word2.toLowerCase().replaceAll("["+word1.toLowerCase()+"]","").isEmpty();
		
	}

}
