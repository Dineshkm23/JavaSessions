package javasessionpractice;

import java.util.Arrays;

public class ArrayConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i[]=new int[2];
		
	System.out.println(i[0]);
		
		String cars[]=new String[3];
		
	for (int j = 0; j < cars.length; j++) {
		cars[j]="Dinesh";
	}
	System.out.println(Arrays.toString(cars));//[Dinesh, Dinesh, Dinesh]
	//
}
}
