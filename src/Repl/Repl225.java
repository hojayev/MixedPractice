package Repl;

import java.util.Arrays;

public class Repl225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value = 3, numberOfEntries =6;
        int[] arr = new int[numberOfEntries];
        for(int i=0; i <numberOfEntries;i++)
          arr[i]=value*i;	
	
        System.out.println(Arrays.toString(arr));
	}

}
