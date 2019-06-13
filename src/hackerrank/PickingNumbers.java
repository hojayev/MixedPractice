package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.graalvm.compiler.lir.LIRInstruction.Temp;

public class PickingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {4, 6, 5, 3, 3, 1}; 
		List<Integer> a = new ArrayList<Integer>();
		a.add(4);
		a.add(6);
		a.add(5);
		a.add(3);
		a.add(3);
		a.add(1);
		
		int temp = 0;
        int count = 1;
        int maxcount = 0;
        for (int each : a){
        	System.out.println("testing " + each);
            count = 0;
            temp = each;
            for (int each1 : a){
                if ( Math.abs(temp-each1)<=1)
                {
                	count++;
                	temp = each1;
                	System.out.println( "temp is " + temp);
                }
            }
            if (count>maxcount) maxcount = count;
            System.out.println(maxcount);

        }

		
		
		
		
	}

}
