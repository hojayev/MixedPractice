package PolymorphismPractice;

public class ElectricCar extends Car {

	int range;
	int batteryLevel;
	int seats = 2;
	
	public void chargeBattery() {
		System.out.println("Battery charging");
	}
	
	@Override
	public void drive() {
		System.out.println("Driving Electrically");
	}
}
