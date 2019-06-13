package slackuserPractice;


public class SlackUser {
	String displayName;
	int timezone;
	String status;


	public SlackUser() {
		
	}
	
	public SlackUser(String displayname, int timezone, String status) {
		this.displayName = displayname;
		this.timezone = timezone;
		this.status = status;
		
	}
	
	public void sendMessage () {
		System.out.println(displayName + " is sending a message");
	}
	
	public void changeStatus (String status) {
		this.status = status;
	}
	
}
