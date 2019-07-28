package Assessment7;

public class UAGStudent {

	String name;
	int grade;
	static String principalName =  "Ms. McKoy";
	String studentID;
	static int nextID =100;
	
	
	public UAGStudent(String name, int grade) {
		this.name = name;
		this.grade = grade;
		studentID = name.toUpperCase().substring(0,1) + nextID;
		nextID++;
	}
	
	
	public static void newPrincipal(String newprincipalName) {
		principalName = newprincipalName;
	}
	
	public static void resetID() {
		nextID=100;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + studentID;
	}
}
