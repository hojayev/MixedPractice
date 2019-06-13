package cybertek;

import java.util.Arrays;





class TestingGround {
	
	static int count;
	
private void name2() {
		
		System.out.println("Initialized");
	}
	
	
	private void name() {
		count++;
		name2();
		System.out.println("Started");
		
		
	}
	
}
	
	public class TestingGround2{

	public static void main(String[] args) {
		//int[] nums = {34, 12, 45, 65, 234, 12, 4};
		
		TestingGround abc = new TestingGround();
		abc.name();
		abc.name2();
		//System.out.println(bigger(5, 4));

		StringBuilder a = new StringBuilder(10);
		String b = "";
		System.out.println(a.toString().equals(b));
		


		
		
//		
//		for(int i = 0; i < nums.length / 2; i++) {
//			
//			int temp = nums[i];
//			nums[i] = nums[nums.length - 1 - i];
//			nums[nums.length - 1 - i] = temp;
//		}
//		
//		System.out.println(Arrays.toString(nums));
			
		
    //Do not modify below line it will be used to test your code. And 
    //Can be used by you while developing your code
    
	}
	
//	public static int bigger(int num1, int num2) {
//		
//		return num1>num2?num1:num2;
//		
//	}

}
