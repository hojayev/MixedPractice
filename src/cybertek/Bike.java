package cybertek;



public class Bike {
	
	static { System.out.println("Welcome to bikes");}
	

	private String brand;
	private int gear;
	private int speed;
	static int countBike;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getGear() {
		return gear;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	private Bike()
	{
		System.out.println("No agrument constructor");
	}
	
	public Bike (String brand, int gear, int speed ) {
		this.brand = brand;
		this.gear = gear;
		this.speed = speed;
		
		countBike++;
		
		
	}
	
	
	public void speedUP (int increaseBy) {
		speed +=increaseBy;
	}
	
	public void slowdown (int decreaseBy) {
		speed +=decreaseBy;
	}
	
	public String toString()
	{
		return "Brand is " + brand + ", Gear is " + gear + ", Speed is " + speed + ", Id is " + countBike;
	}
	
	public static void showCurrentCount() {
		System.out.println("Current count is " + countBike);
	}
	
	
	
	
	
}
