package AbstractPractice;

public class EmployeePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HourlyEmployee ben = new HourlyEmployee(21, "Ben", 12, 12)	;
		
		System.out.println(ben.toString());	

		Employee adEmployee = new Employee(0, null) {
			
			@Override
			public double calculateAnnualSalary() {
				// TODO Auto-generated method stub
				return 0;
			}
		};
	}

}
