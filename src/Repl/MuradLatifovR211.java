package Repl;

import java.util.ArrayList;
import java.util.Arrays;

public class MuradLatifovR211 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "--A---bc-d-";
		String newStr="";
		ArrayList <String>list=new ArrayList<>(Arrays.asList(word.split("")));
				for(int x=word.length()-1; x>=0; x--) {
					char c=word.charAt(x);
					if(c>='a'&&c<='z'||c>='A'&&c<='Z') {
						newStr+=word.charAt(x);
					}
				}
				ArrayList<String>list2=new ArrayList<>(Arrays.asList(newStr.split("")));
			
				String temp="";
				for(int i=0,j=0;i<=list.size()-1; i++) {
				 temp=temp+list.get(i);
					char c1=temp.charAt(i);
					if(c1>='a'&&c1<='z'||c1>='A'&&c1<='Z') {
						list.set(i, list2.get(j++));
					}
				}
		word="";
				for(int j=0; j<=list.size()-1;j++) {
					word+=list.get(j);
				}
				
				
				System.out.println(word);
	}

}
