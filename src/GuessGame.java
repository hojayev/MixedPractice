import java.util.Random;

public class GuessGame {

	
	Player p1 = new Player();
	Player p2 = new Player();
	Player p3 = new Player();
	
	public void startGame () {
		
		Random ran = new Random();
		
		
		int guessIs = ran.nextInt(50);
		
		boolean playing = true;
		
		while (playing) {
			
			boolean p1isRight = false;
			boolean p2isRight = false;
			boolean p3isRight = false;
			
		System.out.println("Number to guess is " + guessIs);
			
			p1.guess();
			p2.guess();
			p3.guess();

			System.out.println("Player1 guesses " + p1.number);
			System.out.println("Player2 guesses " + p2.number);
			System.out.println("Player3 guesses " + p3.number);
			
			
			if ( p1.number == guessIs)
			{
				p1isRight = true;
			}
			
			if ( p2.number == guessIs)
			{
				p2isRight = true;
			}
			
			if ( p3.number == guessIs)
			{
				p3isRight = true;
			}
			
			if (p1isRight || p2isRight || p3isRight)
			{
				System.out.println("We have a winner!!!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player one got it right? " + p2isRight);
				System.out.println("Player one got it right? " + p3isRight);
				System.out.println("Game over. ");
				
				playing = false;
				
			} else System.out.println("Player will try again");
			
			
			
			
		}
		
		
		
	}
	
	
}
