package cybertek;


public class SuperCar {


		// TODO Auto-generated method stub

		final String model;
		final Engine eng;
		final int cylinder;
		
		public SuperCar(String model, Engine eng, int cylinder) {
			this.model = model;
			this.eng = eng;
			this.cylinder = cylinder;
		}

		@Override
		public String toString() {
			return "SuperCar [model=" + model + ", eng=" + eng + ", cylinder=" + cylinder + "]";
		}
	}

	