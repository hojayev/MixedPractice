package PolymorphismPractice;

public class GasCar extends Car {

	int cylinders;
	int seats = 4;
	public void changeOil() {
		System.out.println("Changing oil");
	}
	
	public void drive() {

		System.out.println("Gas Engine drive");
	}
}
