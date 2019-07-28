package Assessments;

public class Assessment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[ ] arr = { 1, 2, 3};

		try {

		System.out.println( arr[100] );

		} catch(RuntimeException  e) {

		System.out.println("Runtime Exception Found");

		} catch (ArrayIndexOutOfBoundsException e) {

		System.out.println("Array index out of bound Exception Found");

		} catch (IndexOutOfBoundsException e) {

		System.out.println("Index out of bound Exception Found");

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		int amt = 2;
		String word ="knife";
		
		if(amt>1 || amt==0) {
			
			if(word.endsWith("fe"))
				word= word.replace("fe", "ves");
			else if(word.endsWith("y"))
				word= word.replace("y", "ies");
			else if(word.endsWith("sh"))
				word= word+"es";
			else if(word.endsWith("ch"))
				word= word+"es";
			else if(word.endsWith("us"))
				word= word.replace("us", "i");
			else word=word+"s";
		}
		
		
		System.out.println(amt+ " "+  word);
	}

}
