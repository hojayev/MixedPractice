package warmup;



import cybertek.forLoopOCA;

public class ReverseSenternce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sunday Perfect Day to start coding";
		String reversed = "";
		String[] arr = str.split(" ");

		for (int i = arr.length - 1; i >= 0; i--) {

			reversed += arr[i] + " ";

		}

		System.out.println(reversed);
		
		
		String a = " ";
		System.out.println(a.trim().isEmpty());
	}

}
