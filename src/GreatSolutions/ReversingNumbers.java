package GreatSolutions;

public class ReversingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12345;
		int newNum = 0;
		
		while(num!=0) {
            newNum = newNum*10 + num%10 ;
            num/=10 ;		
		}
		
		System.out.println(newNum);
		
	}

}
