package cybertek;

import java.util.Scanner;

public class Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int propertyPrice = 0; 
			int numberOfBedrooms, garageSpots;
			float metroAccessibility, schoolScore, highwayAccessibility;
			boolean backyard, smoking, garage;
			String houseType;
			Scanner scan = new Scanner(System.in);
			System.out.println("*****************************************");
			System.out.println("* Welcome to the RealEstate calculator! *");
			System.out.println("*****************************************");
	    //WRITE YOUR CODE HERE
	    
	    
	       float condo, townhouse, familyHome, bedroom, garageN, backyardPrice;
	    condo = 50000;
	    townhouse = 75000;
	    familyHome = 95000;
	    
	    System.out.println("Enter your property type:");
	    houseType = scan.nextLine();
	    if (houseType.equalsIgnoreCase("condo"))
	    {
	      propertyPrice+=condo;
	    }
	    else if(houseType.equalsIgnoreCase("townhouse"))
	    {
	      propertyPrice+=townhouse;
	    }
	    
	    else propertyPrice+=familyHome;
	    
	    System.out.println("How many bedrooms do you have?");
	    numberOfBedrooms = scan.nextInt();
	    propertyPrice+=numberOfBedrooms*30000;
	    
	    System.out.println("Do you have a backyard?");
	    backyard = scan.nextBoolean();
	    
	    if (houseType.equalsIgnoreCase("condo") && backyard)
	    {
	      System.out.println("Backyard is not available for condo!");
	    }
	    
	    else 
	    {
	      propertyPrice+=5000;
	    }
	    
	    System.out.println("Do you have garage?");
	    garage = scan.nextBoolean();
	    if (garage)
	    {
	      System.out.println("How many spots?");
	      garageN = scan.nextFloat();
	      
	      if (garageN>10)
	      {
	        System.out.println("Pardon, it's not a public parking!");
	      }
	      
	      else
	      {
	       propertyPrice+=garageN*20000; 
	      }
	      
	      
	      
	    }
	    
	    System.out.println("How close is metro station?");
	    metroAccessibility=scan.nextFloat();
	    
	    if (metroAccessibility<=1)
	    {
	      propertyPrice+=10000;
	      
	    }
	    
	    else if (metroAccessibility<=3)
	    {
	      propertyPrice+=5000;
	    }
	    
	    System.out.println("How close is highway?");
	    highwayAccessibility = scan.nextFloat();
	    
	    if (highwayAccessibility<=1)
	    {
	      propertyPrice+=15000;
	    }
	    else if (highwayAccessibility < 5)
	    {
	      propertyPrice+=8000;
	    }
	    else if (highwayAccessibility<20)
	    {
	      propertyPrice+=4000;
	    }
	    
	    System.out.println("What's the rating of nearest school?");
	    schoolScore = scan.nextFloat();
	    
	    if (schoolScore<=10 && schoolScore>=8)
	    {
	      propertyPrice+=45000;
	    }
	    else if (schoolScore<8 && schoolScore>=4)
	    {
	      propertyPrice+=20000;
	    }
	    
	    else propertyPrice+=5000;
	    
	    System.out.println("Does any of your family members smoking?");
	    smoking = scan.nextBoolean();
	    
	    if(smoking)
	    {
	      propertyPrice-=5000;
	    }
	    
	   
	    
	    System.out.println("Market report has been generated.");
	    System.out.println("Your estimate market price is: "+ propertyPrice+"$");
	    
	    
		
		
	}

}
