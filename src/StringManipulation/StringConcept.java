package StringManipulation;

import java.util.Iterator;

public class StringConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Hello this is my is this is java code";
		
		System.out.println(str.length());
		
	System.out.println(str.charAt(3));
	System.out.println(str.charAt(24));
	
	//System.out.println(str.charAt(30)); stringIndexOutofBoundsException
	
	System.out.println(str.indexOf("H"));
	System.out.println(str.indexOf("i"));
	System.out.println("-------");
	System.out.println(str.indexOf("i",23)); 
	
	
//	System.out.println("-------");
//	System.out.println(str.indexOf("i",str.indexOf("i",1)+1)); 
//	System.out.println(str.indexOf("i")+1);
	
	System.out.println("replace all concept...........");
	
	String name="Dinesh kumar";
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	
	String str1= "Hello Dinesh how are you, hope your doing good";
	
	String reaplceStr1=str1.replace(",", "!@#");
	System.out.println(reaplceStr1);
	System.out.println(str1.replaceAll("[^a-zA-Z0-9]", "||"));
	
	
	String str2="hi dinesh hi hello kumar dinesh";
	
	
	System.out.println(str2);
	for (int i = 0; i <= str2.length()-1; i++) {
		//System.out.println(str2.indexOf("i", i+1));
		
		if((str2.charAt(i))=='n')
		{
			System.out.println(str2.indexOf('n'));
		}
	
	}
	
	
	}
	
	

}
