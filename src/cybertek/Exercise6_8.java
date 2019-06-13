package cybertek;

public class Exercise6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Celcius    Fahrenheit   |   Fahrenheit     Celcius");;	
		
		double a = 40.0;
		double b = 120.0;
	
		for (int i = 1; i<=10; i++)
		{	
			if (cToF(a)<100)
			{
				System.out.println("   "+ a + "      " + cToF(a) + "       |      "+ b +"        "+ fToC(b));
				
			}
			else {
			System.out.println("   "+ a + "      " + cToF(a) + "      |      "+ b +"        "+ fToC(b));
			}
			a = a - 1;
			b = b - 10;
		
		}
		
		
	}

	
	public static double cToF (double c)
	{
		
		return Math.floor((9.0/5.0*c+32)*100)/100;
		
		
	}
	
	public static double fToC (double f)
	{
		return Math.floor(5.0/9.0*(f-32)*100)/100;
	}
	
	
}
