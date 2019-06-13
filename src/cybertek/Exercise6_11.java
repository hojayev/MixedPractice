package cybertek;

public class Exercise6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 10000; i <=100000; i+=5000)
		{
		System.out.println(computeCommission(i));
		}
		
	}

	public static double computeCommission (double salesAmount) {
		
		double commisiton = 0;
		
		if (salesAmount<= 5000)
		{
			return salesAmount*8/100;
					
		}
		
		else if (salesAmount <=1000) {
			
			return (5000*8/100 + (salesAmount-5000)*10/100);
			
		}
		
		else return (5000*8/100 + 5000*10/100 + (salesAmount-10000)*12/100);
		
		
		
	}
	
	
}
