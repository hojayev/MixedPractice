import java.util.Random;

public class Player {
	
	 int number;
	
	 public void guess() {
		
		Random rand = new Random();
		
		number = rand.nextInt(50);
		

		
	}
	

}
