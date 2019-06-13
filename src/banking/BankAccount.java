package banking;

public class BankAccount {

	String name;
	double balance;
	
	
	public void showAccountHolder()
	{
		System.out.println(name);
	}
	
	public void showBallance()
	{
		System.out.println(balance);
	}
	
	public void addAmmount(double num) {

		balance +=num; 
	}
	
	
	
}
