package cybertek;

import java.util.Scanner;

public class CarInsuranceQuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    double premium = 0;
			int accidentsAmount = 0;
			int daysDrivenToWorkOrSchool = 0;
			int milesToWorkOrSchool = 0;
			String vehicleOwnership = "";
			String vehicleUsage = "";
			String continuousInsurance = "";
			String education = "";
			String name = "";
			String referenceNumber = "";
			Scanner scan = new Scanner(System.in);
			System.out.println("Welcome to the CountyFarm car insurance!");
	    //WRITE YOUR CODE HERE
	    		//	System.out.println("Welcome to the CountyFarm car insurance!");
				System.out.println("Enter your name");
				
				name = scan.nextLine();
				
				System.out.println("Do you have a US driver license?");
				
				if(scan.next().equalsIgnoreCase("no"))
				{
					System.out.println("Invalid data!");
					System.exit(0);
				}
			
				System.out.println("Enter your zip code");
				int zipCode = scan.nextInt();
				
				if (zipCode == 20910 || zipCode == 20740)
				{
					premium += 60;
				}
				
				else if (zipCode == 22102 || zipCode == 22103)
				{
					premium += 30;
				}
				
				else premium += 50;
			
				System.out.println("Is this vehicle Owned, Financed, or Leased?");
				 if(scan.next().equalsIgnoreCase("owned"))
				 {
					 premium += 10;
				 }
				 
				 else premium += 20;
				 
				 System.out.println("How is this vehicle primarily used?");
				 vehicleUsage = scan.next();
				 
				 if (vehicleUsage.equalsIgnoreCase("business"))
				 {
					 premium += 50;
				 }
				
				 
				 else if (vehicleUsage.equalsIgnoreCase("pleasure"))
				 {
					 premium += 10; 
				 }
						
				 else if (vehicleUsage.equalsIgnoreCase("commute"))
				 {
					 premium += 20; 
					 
					 System.out.println("Days Driven To Work And/Or School");
					 
					 premium += scan.nextInt()*5;
					 
					 System.out.println("Miles Driven To Work And/Or School");
					 
					 premium += scan.nextInt();
					 
					 
				 }
				 
				 System.out.println("How old are you?");
				  
				 int age = scan.nextInt();				 		
				
				 if (age < 16)
				 {
					 System.out.println("Invalid data!");
					 System.exit(0);
				 }
				 
				 if (age >=16 && age <18)
				 {
					 premium = premium*20;
				 }
				 
				 if (age >=18 && age <=21)
				 {
					 premium = premium*6;
				 }
				 
				 if (age > 21 && age < 25)
				 {
					 premium = premium*2;
				 }
				
				 System.out.println("How many years you've been driving?");
				 
				 int drivingEx = scan.nextInt();
				
				 if (drivingEx < 0 || (age-drivingEx)<0) //driving age less than 0 Maybe need <=
				 {
					 System.out.println("Invalid data!");
					 System.exit(0);
				 }
				 
				 premium -= 5*drivingEx;
				 
				 System.out.println("Have you had any accidents in the last 5 years?");
				 
				 if (scan.next().equalsIgnoreCase("yes")) 
				 {
					 System.out.println("How many?");
					  premium += scan.nextInt()*premium*20/100; 
					 
				 }
				 
				 System.out.println("Have you had continuous insurance for the past 12 months?");
				 
				 if(scan.next().equalsIgnoreCase("no"))
				 {
					 premium = premium*2;
				 }
				 
				 System.out.println("What is the highest level of education you have completed?");
				 
				 scan.nextLine();
				 education = scan.nextLine();
				 
				 if (education.equalsIgnoreCase("phd") || education.equalsIgnoreCase("bachelors")||education.equalsIgnoreCase("masters") )
				 {
					 premium -= premium*5/100;
				 }
				 
				 else if (education.equalsIgnoreCase("Doctors"))
				 {
					 premium -= premium*10/100;
				 }
				 
				 else if (education.equalsIgnoreCase("Less than High School"))
				 {
					 premium += premium*5/100;
				 }
					 
				 System.out.println(name + ", here's your quote!");	
				 System.out.println("Start Your Policy Today For: $" + premium);
				System.out.println("Reference number: " + (name.substring(0,2) + age + name.substring(name.length()-2) + zipCode + education.replace(" ","")).toUpperCase());
				 


			
			
	}

}


//Ray
//Yes
//20910
//Owned
//Business
//45
//10
//Yes
//1
//Yes
//Bachelors