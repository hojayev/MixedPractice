package cybertek;

public class Exercise6_13 {

	public static void main(String[] args) {
		
		
		System.out.println("i"+ "\t"+ "m(i)");
		
		for (int i = 1; i<=20; i++) {
			System.out.println( i + "\t" + calc(i));
		}
		
		
	}	
		
	public static double calc (int a) {
		
		double total = 0;
		
		for (double i = 1; i<=a; i++)
		{
			total +=i/(i+1);
				
		}
		
		return total;
	}
		
		
	

}
