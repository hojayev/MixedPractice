package banking;

public class Banking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount one = new BankAccount();
		one.balance = 200;
		one.name = "Johny Cash";
		
		one.showAccountHolder();
		one.showBallance();
		one.addAmmount(300);
		one.showBallance();
		
		
		BankAccount two = new BankAccount();
		two.balance = 23200;
		two.name = "Michal Jackson";
		
		two.showAccountHolder();
		two.showBallance();
		two.addAmmount(3000);
		two.showBallance();
	}

}
