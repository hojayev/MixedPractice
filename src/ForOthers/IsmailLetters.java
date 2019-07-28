package ForOthers;


public class IsmailLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "ttnnmmmmmaaaaoooott";
        
        String output="";
        String[] arr =s.split("");
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
	

}
