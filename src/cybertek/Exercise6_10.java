package cybertek;

public class Exercise6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i =2; i<=100;i++)
		{
			if (isPrime(i))
			{
				System.out.println(i);
			}
		}
		
		
		
	}

	public static boolean isPrime (int n)
	{	
		int count = 0; 
		for (int i = 2; i<=n; i++ )
		{
			if (n%i==0)
			{
				count++;
				if (count > 1)
				{
					return false;
				}
			}
		}
		
		//System.out.println(count);
		return true;
		
	}
	
	
}
