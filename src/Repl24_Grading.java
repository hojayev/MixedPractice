import java.util.Scanner;
import java.text.DecimalFormat;

class Repl24_Grading {
  public static void main(String[] args) {
    // Enter your code here
    String  subject1,  subject2, subject3,  subject4, subject5, summary;
    double  grade1,  grade2, grade3,  grade4, grade5, average;
    
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Grader!");
    System.out.println("Please enter subject name number 1 and score for this subject");
    subject1 = input.nextLine();
    grade1 =input.nextDouble();
    input.nextLine();
    
    System.out.println("Please enter subject name number 2 and score for this subject");
    subject2 = input.nextLine();
    grade2 =input.nextDouble();
    input.nextLine();
    
    
    System.out.println( "Please enter subject name number 3 and score for this subject");
    subject3 = input.nextLine();
    grade3 =input.nextDouble();
    input.nextLine();
    
    
    System.out.println("Please enter subject name number 4 and score for this subject");
    subject4 = input.nextLine();
    grade4 =input.nextDouble();
    input.nextLine();
  
    System.out.println("Please enter subject name number 5 and score for this subject");
    subject5 = input.nextLine();
    grade5 =input.nextDouble();
    input.nextLine();
    
    DecimalFormat df = new DecimalFormat("#.00"); 
    
    average = (grade1+grade2+grade3+grade4+grade5)/5;
    
    
    
    System.out.println("Summary: " + subject1+ " - " + grade1 + ",  "+ subject2+ " - " + grade2 + ",  "+ subject3+ " - " + grade3 + ",  "
                                    + subject4+ " - " + grade4 + ",  "+ subject5+ " - " + grade5);
    System.out.println("Your average score is: "+ df.format(average));
   System.out.println("Thank you for using Grader!");
System.out.println("Goodbye!");
    
    
    
    
  }
  
}
  