package bankingAccount;

public class BankAccount {
	
	String accountName;
	long accountNumber;
	double balance;
	
	
	public BankAccount(String accountName, long accountNumber, double balance) {
		super();
		this.accountName = accountName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	
	public void withdraw(double amount) {
		balance -= amount;
	}

	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", accountNumber=" + accountNumber + ", balance=" + balance
				+ "]";
	}
	
	

}
