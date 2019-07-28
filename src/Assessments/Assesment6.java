package Assessments;

public class Assesment6 {

	String firstname;
	String lastname;
	int birthmonth;
	int birthday;
	int birthyear;
	String ssn;
	public Assesment6(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthmonth = birthmonth;
		this.birthday = birthday;
		this.birthyear = birthyear;
		this.ssn = ssn;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public int getBirthmonth() {
		return birthmonth;
	}
	public String getBirthday() {
		
		return ""+birthmonth+"/"+birthday+ "/" +birthyear;
		
		
	}
	public boolean verifySSN(String ssncheck) {
		if(ssn.equals(ssncheck)) return true;
		
		return false;
	}
	public String getSsn() {
		return ssn;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
	

}
