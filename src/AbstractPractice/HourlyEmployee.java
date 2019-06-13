package AbstractPractice;

public class HourlyEmployee extends Employee{
	
	private double hoursWorked;
	private double hourlyRate;
	
	public  HourlyEmployee(int id, String name, double hoursWorked, double hourlyRate) {
		
		super(id, name);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
		
	}
	
	
	public double getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public double getHourlyRate() {
		return hourlyRate;
	}


	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}


	@Override
	public double calculateAnnualSalary() {
		// TODO Auto-generated method stub
		return hoursWorked*12*hourlyRate;
	}


//	@Override
//	public String toString() {
//		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", hourlyRate=" + hourlyRate + "]";
//	}

}
