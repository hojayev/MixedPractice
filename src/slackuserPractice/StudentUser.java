package slackuserPractice;

public class StudentUser extends SlackUser {
	int groupNumber;
	
	public StudentUser(String displayname, int timezone, String status, int groupNumber ) {
		
	}

	public StudentUser(int groupNumber) {
		super();
		this.groupNumber = groupNumber;
	
	}
	
	
	

	public StudentUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentUser(String displayname, int timezone, String status) {
		super(displayname, timezone, status);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentUser [groupNumber=" + groupNumber + ", displayName=" + displayName + ", timezone=" + timezone
				+ ", status=" + status + "]";
	}
	
	
	
}
