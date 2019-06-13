package cybertek;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String user1 = "Manager";
		String pass = "Password";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your username:");
		
		String username = input.nextLine();

		if (username.equals("admin")) {
			
			
			System.out.println("Login successful");
			
		}
		
		else {
			System.out.println("Enter your password");
			String password = input.nextLine();
			
			if (username.equals(user1) && password.equals(pass))
			{
				System.out.println("Login successful");
			}
			
			else System.out.println("Login Unsuccessful");
		}
			
			
		
		
		
	}

}
