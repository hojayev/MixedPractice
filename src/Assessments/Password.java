package Assessments;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "Password1";
		
		System.out.println(checkPass(word));
		
	}

	
	public static String checkPass(String word) {
		
		if(word.length()<8) return "Password should contain minimum 8 characters";
		
		if(word.replaceAll("[A-Z]","").length()==word.length()) return "Password should contain at least 1 uppercase number";
		if(word.replaceAll("[a-z]","").length()==word.length()) return "Password should contain at least 1 lowercase number";
		if(word.replaceAll("[0-9]","").length()==word.length()) return "Password should contain at least 1 digit";
		//if(word.replaceAll("[!-?]","").length()==word.length()) 
		
		if(word.replaceAll("[@]","").length()==word.length()) return "Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.";
		//if(word.replaceAll("[A-Z]","").replaceAll("[a-z]","").replaceAll("[0-9]","").length()==0) return "Password should contain at least 1 of these special characters: ~`!@#$%^&*()+=_-{}[]\\|:;”’?/<>,.";
		
		
		return "Password Accepted";
	}
}
