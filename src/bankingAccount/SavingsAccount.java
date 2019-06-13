package bankingAccount;

public class SavingsAccount  extends BankAccount{

//	String accountName;
//	long accountNumber;
//	double balance;
	
	double interestRate;
	
	public SavingsAccount(String accountName, long accountNumber, double balance, double interestRate) {
		super(accountName, accountNumber, balance);
		this.interestRate = interestRate;
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	
	
	
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance -= amount - 10;  
	}







	@Override
	public String toString() {
		return "SavingsAccount [interestRate=" + interestRate + ", accountName=" + accountName + ", accountNumber="
				+ accountNumber + ", balance=" + balance + "]";
	}

	
	
	
	
	
}
