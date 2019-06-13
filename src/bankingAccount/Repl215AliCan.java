package bankingAccount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Repl215AliCan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//changing array values
		
		Character[] ch = {'a', 'b'};
		ArrayList<Character> characters = new ArrayList<Character>(Arrays.asList(ch));
		
		Integer[] arr = {3,1,2,4,3,1,5,6,1,2,3,3,4};
		String [] arrs = {"one", "two","three"};
	
		ArrayList<String> arrLs = new ArrayList<>(Arrays.asList(arrs));
		ArrayList<Integer> arrLI = new ArrayList<>(Arrays.asList(arr));
		
		
		
		ArrayList<Integer> ab = new ArrayList<>(Arrays.asList(3,1,2,4,3,1,5,6,1,2,3,3,4));
		
		System.out.println(ab);                              
		int n = 3;										
		
		
		for (int i = 0; i < ab.size(); i++) {
			
			if(ab.get(i)%2==0) {
				ab.set(i, ab.get(i)+1);
			}
			
		}
		
		System.out.println(ab);
		
		
		
		
//		for (int i = 0; i < ab.size(); i++) {
//			
//			if(ab.get(i)==n) {
//				
//				ab.remove(i);
//				i--;
//			}
//						
//		}
		
//		ArrayList<Integer> removed = new ArrayList<Integer>();
//		
//		for (int i = 0; i < ab.size(); i++) {
//			if(ab.get(i)!=n) 
//				removed.add(ab.get(i));
//		}
		
		
		
		System.out.println(ab);
//		System.out.println(removed);
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<Integer> even = new ArrayList<Integer>();
//		ArrayList<Integer> odd = new ArrayList<Integer>();
//		
//		for (int i = 0; i<ab.size(); i++ ) {
//			
//			if(ab.get(i)%2==0) even.add(ab.get(i));
//			else odd.add(ab.get(i));
//						
//		}
//		
//		System.out.println("Even list " + even);
//		System.out.println("Odd list " + odd);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int [] odd;
//		int countEven = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(arr[i]%2==0) {
//				countEven++;
//			}
//						
//		}
//		
//		int [] even = new int[countEven];
//		
//		int x = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(arr[i]%2==0) {
//				
//				even[x]=arr[i];
//				x++;
//			}
//		}
//		
//		int[] odd = new int [arr.length-countEven];
//		int y = 0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i]%2!=0) {
//				odd[y]=arr[i];
//				y++;
//			}
//		}
//		
//		
//		
//		
//		
//		
//		
//		
//		System.out.println("we have " + countEven + " even numbers");
//		System.out.println(Arrays.toString(even));
//		System.out.println(Arrays.toString(odd));
//		
//		
//		
		
		
		
//		
//		System.out.println(Arrays.toString(odd));
		
		
		
		
		
		
		
 		
//		
//		int sum = 0;
//		int negSum = 0;
//		
//		for (int each : arr)
//		{
//			
//			sum+=each;
//			
//		}
//		
//		
//		System.out.println("sum is " + sum);
//		System.out.println("average is " + sum/arr.length);
//		
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int min = arr[0];
//		int max = arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			if(arr[i]<min ) {
//				min = arr[i];
//				
//			}
//			
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
//		
//		System.out.println("Min is " + min);
//		System.out.println("Max is " + max);
		
		
		

	}

}
