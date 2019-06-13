
public class Dog {

	String name;
	int size;

	void bark(int n) {
		while (n > 0) {

			if (size < 30) {
				System.out.println("Bark Bark");
			}

			else
				System.out.println("Raff raff");

			n--;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog abc = new Dog();

		abc.name = "Berdy";
		abc.size = 30;
		abc.bark(3);
		System.out.println(abc.name);

	}

}
