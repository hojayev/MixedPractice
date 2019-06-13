package cybertek;

public class ArrayAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] courses = {
				"Welcome Kit",
				"Online-Java Programming",
		    	"Online-Software Development Lifecycle",
		    	"Online-Software QA Testing",
		    	"Online-Team Activity",
		    	"Online-Mentoring", 
		    	"Online-Selenium",
		    	"Online-SQL",
		    	"Online-API Testing"
				} ;
	int[] courseId = {143,166,168,170,163,203,169,171,164} ; 	
	
	String course203 = "";
	
	int softwarecount =0;
	
	int i;
	
	for( i = 0; i < courses.length; i++);
	System.out.println("Course id for " + courses[i] + " is "+ courseId[i]);
		
		if(courseId[i]==203)
		{
			course203= courses[i];
		}
	
		
		if(courses[i].contains("Software"))
		{
			softwarecount++;
		}
		
			
	
		
	System.out.println("Course 203 is " + course203);
	System.out.println("Software count is "+ softwarecount);
	
		
		
		
	}

}
