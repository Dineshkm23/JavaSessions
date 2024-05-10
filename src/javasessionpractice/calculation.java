package javasessionpractice;

import java.util.Scanner;

public class calculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		long num1,num2,num3,num4,num5;
		
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter action (add/sub/mult/divide");
		String action=Scanner.nextLine();
		if (action.contains("add") || (action.contains("addition"))) {
			
			System.out.println("enter num1");
			num1=Scanner.nextLong();
			System.out.println("enter num2");
			num2=Scanner.nextLong();
			System.out.println("enter num3");
			num3=Scanner.nextLong();
			System.out.println("enter num4");
			num4=Scanner.nextLong();
			long sum_of_numbers=num1+num2+num3+num4;
			System.out.println("Sum of all the numbers: "+sum_of_numbers);
		}
		
		else if (action.contains("sub") || (action.contains("substraction"))) {
			
			System.out.println("enter num1");
			num1=Scanner.nextLong();
			System.out.println("enter num2");
			num2=Scanner.nextLong();
			System.out.println("enter num3");
			num3=Scanner.nextLong();
			System.out.println("enter num4");
			num4=Scanner.nextLong();
			long sub_of_numbers=num1-num2-num3-num4;
			System.out.println("Substraction of all the numbers: "+sub_of_numbers);
		}
		
		
	}

}
