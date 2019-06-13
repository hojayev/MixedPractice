package hackerrank;

import java.util.Arrays;



public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
		
        String[] arr = new String [0];
        int x = 0;
        int j = 0;
        for(int i = j; i<str.length(); i++ )
        {    
            if((str.charAt(i)>='A'&& str.charAt(i)<='Z')|| (str.charAt(i)>='a'&& str.charAt(i)<='z')) 
            {        
                
                for(j = i; j<str.length();j++ )
                {    
                    if (j==str.length()-1 && ((str.charAt(j)>='A'&& str.charAt(j)<='Z')|| (str.charAt(j)>='a'&& str.charAt(j)<='z')))
                    {
                        arr = Arrays.copyOf(arr, arr.length+1);
                        
                        arr[x++]=str.substring(i,j+1);
                        i=j;
                        break;
                        
                    }
                    
                    
                    else if((str.charAt(j)>='A'&& str.charAt(j)<='Z')|| (str.charAt(j)>='a'&& str.charAt(j)<='z')) 
                    
                    continue;
                    
                    
                    
                    
                    else
                    {arr = Arrays.copyOf(arr, arr.length+1);
                    
                    arr[x++]=str.substring(i,j);
                    i=j;
                    break;
                    }
                }    
            }    
        }

        System.out.println(arr.length);

        for (String each : arr) System.out.println(each);
		
	}

}
