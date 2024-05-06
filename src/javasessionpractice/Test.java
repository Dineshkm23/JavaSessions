package javasessionpractice;

public class Test {

	public static void main(String[] args) {
		System.out.println("Dinesh");
		
		System.out.println((int)'A');
		int data=97;
		System.out.println((char)data);
		
		//char ch='a';
		//System.out.println(ch);
		switch (data) {
		case 10:
			System.out.println(data+" is vowel");
			break;

		default:
			break;
		}
		
		
		  for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {

	            System.out.println(ch1 + ":" + (double)ch1);
		  }
		  
		    // Create arrays for A-Z, a-z, and 0-9 characters

	        char[] upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	        System.out.println(upperCaseChars);
	        char[] lowerCaseChars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
            System.out.println(lowerCaseChars);
	        char[] digitChars = "0123456789".toCharArray();
	        System.out.println(lowerCaseChars);
	        // Print A-Z and their ASCII values using for-each loop

	        for (char ch : upperCaseChars) {

	            System.out.println(ch + ": " + (int) ch);
	        	}
	        // Print a-z and their ASCII values using for-each loop

	        for (char ch : lowerCaseChars) {

	            System.out.println(ch + ": " + (int) ch);

	        }
	        // Print 0-9 and their ASCII values using for-each loop
	        for(int a:digitChars)
	        {
	        	System.out.println("ASCII value:" +a);
	        }
}
}