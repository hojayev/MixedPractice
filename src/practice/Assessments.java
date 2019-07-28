package practice;

public class Assessments {

 private String size;
 private int numberCT;
 private int numberPT;
 private int numberHT;
 
 public Pizza(String size, int numberCT, int number PT, int numberHT) {
	 
	 this.size = size;
	 this.numberCT = numberCT;
	 this.numberPT =numberPT;
	 this.numberHT = numberHT;
 }
 
 
 
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}
public int getNumberCT() {
	return numberCT;
}
public void setNumberCT(int numberCT) {
	this.numberCT = numberCT;
}
public int getNumberPT() {
	return numberPT;
}
public void setNumberPT(int numberPT) {
	this.numberPT = numberPT;
}
public int getNumberHT() {
	return numberHT;
}
public void setNumberHT(int numberHT) {
	this.numberHT = numberHT;
}
 
 public double calcCost() {
	 int totalT = numberCT+numberPT+numberHT;
	 
	 return ((size.equals("Small")? 10 :(size.equals("Medium")?12 : 14))+ totalT*2);
 }




public String getDescription() {
	return "Assessments [size=" + size + ", numberCT=" + numberCT + ", numberPT=" + numberPT + ", numberHT=" + numberHT
			+ "]";
}
 
 
 

}
