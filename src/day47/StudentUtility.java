package day47;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentUtility {
	
	private static ArrayList<String> studentList;
	
	static {
		System.out.println("Welcome to StudentUtility");
	}
	
	static {
		studentList = new ArrayList<String>(Arrays.asList("One", "Two", "Three", "Four"));
		System.out.println("All students have been loaded");
	
	}
	
	public static void displayAllStudent() {
		
		System.out.println(studentList);
		
	}
	
	
	public static void addStudent(String student) {
		studentList.add(student);
	}
	

	public static void updateStudent( int index, String student ) {
		
		studentList.set(index, student);
	}
	
	
	public static void main(String[] args) {
		displayAllStudent();
	}
	
	
}
