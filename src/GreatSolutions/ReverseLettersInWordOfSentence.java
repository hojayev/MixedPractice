package GreatSolutions;

public class ReverseLettersInWordOfSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		String arr[]=str.split(" ");
			
				
				String reversed="";
				for(int i=0; i<arr.length;i++) {
					for(int j=arr[i].length()-1; j>=0;j--) {
						reversed=""+arr[i].charAt(j);
						System.out.print(reversed);
					}
				System.out.println();
				}
		
		
		
		
		
	}

}
