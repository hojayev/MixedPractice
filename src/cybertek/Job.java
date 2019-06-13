package cybertek;

public class Job {

	private String title = "undefined", company = "unknown";
	private Long annualSalary;

	
	public Job(String title) {
		this.title = title;
	}
	
	public Job(String title, String company, Long salary) {
		this.title = title;
		this.company = company;
		this.annualSalary = salary;
	}
	
	public String toString () {
		return "Title is " + title + ", company is " + company +
				", Annual salary is " + annualSalary;
				
	}
	
}
