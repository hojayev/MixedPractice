package ForOthers;

public class SymeyyeLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaabbbbbbddcmmm";
		String[] arr1 = str.split("");
		
		String last="";
		int count = 1;
		for (int i = 0; i < arr1.length; i++) {
			count = 1;
			
			for (int j = i+1; j < arr1.length; j++) {
				if(arr1[i].equals(arr1[j])) {
					count++;
					i=j;
				}
				
			}
			
			last += count + arr1[i];
		}
		
	
		//return last;
		
		System.out.println(last);
	}

}
