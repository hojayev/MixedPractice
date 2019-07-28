package PolymorphismPractice;

public class Garage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new ElectricCar();
		Car car2 = new GasCar();
		
		car1.drive();
		System.out.println(((ElectricCar)car1).seats);
		car2.drive();
		System.out.println(car2.seats);
		
		ElectricCar car3 = new ElectricCar();
		car3.chargeBattery();
		
		
		
		
		
	}

}
