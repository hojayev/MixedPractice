package javaCodingInterview;

import java.util.ArrayList;
import java.util.Arrays;

public class ElementCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input= "AAAABCCCDA";
		String output= "";

        String[] arr =input.split("");
        int count;
        for(int i=0; i < arr.length-1;i++) {
            count =1;
            while(i<arr.length-1 && arr[i].equals(arr[i+1]) ) {
                count++;
                i++;
            }
            output+= count+arr[i];
            
        }
        
        
    System.out.println(output);
    }

		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
//		String[] arr = input.split(""); 
//		int count = 0;
//		for (int i = 0; i < arr.length; i++) {
//			count =1;
//			for (int j = i+1; j < arr.length; j++) {
//				if(arr[i].equals(arr[j])) {
//					count++;
//					i=j;
//				}
//					else { 
//				
//					break;
//				}
//			}
//			output +=count +arr[i];
//			
//		}
//		
//		System.out.println(output);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList <String> a= new ArrayList<>(Arrays.asList(input.split("")));
//		int count=1;
//		String newword="";
//		
//		for(int i=0; i<a.size();i++) {
//			System.out.println(a);
//			for(int j=i+1; j<a.size();j++) {
//				if(a.get(i).equals(a.get(j))) {
//					count++;
//					a.remove(j);
//					j--;
//				}
//				else break;
//			}
//			newword+=count+a.get(i);
//			count=1;
//			
//		}
//		System.out.println(newword);		
//		
		
//		int count = 1;
//		
//		String[] arr = input.split("");
//		String output = "";
//		
//		for (int i = 0; i < arr.length; i++) {
//			 
//			 
//			 if(i<arr.length-1 && arr[i].equals(arr[i+1])) {
//				 count++;
//				 continue;
//			 }
//				 
//			 if(i<arr.length-1 && !arr[i].equals(arr[i+1]) ) {
//				
//				output +=(count + arr[i]);
//				count= 1;
//			 }
//			 
//			 else if(i==arr.length-1) {
//					
//				output +=(count + arr[i]);
//				count= 1;
//			 }
//			 
//		}
//		
//		
//		 System.out.println(output);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int count = 0;
//		
//		String[] arr = input.split("");
//		String output = "";
//		
//		for (int i = 0; i < arr.length; i++) {
//			 count = 0;
//			if(output.contains(arr[i]))
//				continue;
//			
//			for (int j = 0; j < arr.length; j++) {
//				if(arr[i].equals(arr[j])) count++;
//			}
//		
//			output+=(count+arr[i]);
//		}
//		
//		System.out.println(output);
		
			
	

}
