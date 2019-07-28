package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Car> list= new ArrayList<Car>();
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		list.add(new Car());
		
		
		Iterator<Car> a  = list.iterator();
		
		while (a.hasNext()) {
			
			
			Car current = a.next();
			System.out.println(current.lights);
			current.lights = "off";
			
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).lights);
		}
		
	}
	
}


  class Car{
	
	  String lights = "on"; 	  	  
   
  }