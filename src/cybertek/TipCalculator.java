package cybertek;
import java.util.Scanner;



public class TipCalculator {
public static void main(String[] args) {
		
		// "\n" means - starts from new line +
		
		// "*****\n" - it will give u space with word lines 
    Scanner input = new Scanner(System.in);
    
    System.out.println("Would you like to split the check?");
    int num = 1;
    String split = input.next();
    
    if (split.equalsIgnoreCase("yes"))
    {
      System.out.println("What is the number of people?");
      num = input.nextInt();
    }
    
    System.out.println("What is the quality of service?");
    
    int tip = 0;
    
    String quality = input.next();
    
    switch(quality.toLowerCase())
    {
      case "poor":
        tip = 5;
        break;
      
      case "fair":
        tip = 10;
        break;
        
      case "good":
        tip = 15;
        break;
      
      
      case "great":
        tip = 20;
        break;
        
      case "excellent":
        tip = 25;
        break;  
      
      
      
      
    }
    
    System.out.println("Enter the total amount:");
    
    double total = input.nextDouble();
    
    double tipAmount = total*tip/100;
    double totalAmount = total+tipAmount;
    double totalPerPerson = totalAmount/num;
    double tipPerPerson = tipAmount/num;
    

  
    System.out.println("Number of people entered: "+ "&".repeat(num));
    System.out.println("Total to pay: " + totalAmount);
    System.out.println("Total tip: " + tipAmount);
    System.out.println("Total per person: " + totalPerPerson);
    System.out.println("Tip per person: " + tipPerPerson);
    
	}
}
