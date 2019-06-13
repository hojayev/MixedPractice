package bankingAccount;

public class Accounts {
		
	String name;
	int age;
	
	String breed;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getBreed() {
		return breed;
	}


	public void setBreed(String breed) {
		this.breed = breed;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount save1 = new SavingsAccount("Berdy", 1234567, 1000000, 10);
		
		System.out.println(save1);
		
		
	}

}
