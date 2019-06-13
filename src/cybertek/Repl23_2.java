package cybertek;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Enter your code here
    
    String firstName, lastName, fullName, email, street, state, city, address, contacts;
    int age, zipcode;
    double height, weight;
    boolean isMarried; 
    long workPhoneNumber, personalPhoneNumber;
    
    Scanner input = new Scanner(System.in);
    
    
    
    System.out.println ("Welcome to the patient portal!");
    System.out.println ("Please enter your personal information");

    System.out.println ("Enter your first name");
    firstName = input.nextLine();


    System.out.println("Enter your last name");
    lastName = input.nextLine();
    

    System.out.println ("Enter your email");
    email = input.nextLine();

    System.out.println( "Enter your street");
    street = input.nextLine();

    System.out.println("Enter your city");
    city = input.nextLine();

    System.out.println ("Enter your state");
    state = input.nextLine();

    System.out.println("Enter your zip code");
    zipcode = input.nextInt(); 
    input.nextLine();
    

    System.out.println ("Enter your work phone number");
    workPhoneNumber = input.nextLong();
    input.nextLine();
    
    System.out.println ("Enter your personal phone number");
    personalPhoneNumber = input.nextLong();
    input.nextLine();
    

    System.out.println ("Enter your age");
    age = input.nextInt();
    input.nextLine();

    System.out.println ("Enter your height");
    height = input.nextDouble();
    input.nextLine();

    System.out.println ("Enter your weight");
    weight = input.nextDouble();
    input.nextLine();

    System.out.println ("Are you married?");
    isMarried = input.nextBoolean();
    
    System.out.println ("Patient personal information");
    System.out.println ("Full name: " + lastName+ ", " + firstName);
    System.out.println ("Address: " + street + ", " + city + ", "+ state + " " +zipcode);   
    System.out.println ("Contacts: work phone number - " + workPhoneNumber  +", personal phone number - " + personalPhoneNumber +", email: " +email);
    System.out.println ("Age: "+ age);
    System.out.println ("Height: " + height);
    System.out.println ("Weight: " + weight + " pounds");
    System.out.println ("Married?: " + isMarried);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }
}