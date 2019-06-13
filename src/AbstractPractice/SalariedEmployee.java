package AbstractPractice;

public class SalariedEmployee extends Employee {

	private double monthlySalary;
	
	public double getMonthlySalary() {
		return monthlySalary;
	}



	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}



	public SalariedEmployee (int id, String name, double monthlySalary) {
		super(id, name);
		this.monthlySalary = monthlySalary ;
	}
	
	
	
	@Override
	public double calculateAnnualSalary() {
		// TODO Auto-generated method stub
		return monthlySalary*12;
	}



//	@Override
//	public String toString() {
//		return "SalariedEmployee [monthlySalary=" + monthlySalary + "]";
//	}





	
	
}
