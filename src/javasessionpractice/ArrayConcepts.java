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
		System.out.println(Arrays.toString(cars));
	}
	System.out.println(Arrays.toString(cars));//[Dinesh, Dinesh, Dinesh]
	//
	short sh[] = new short[3];//0 to 2
	System.out.println("length = " + sh.length);
	System.out.println("Li = " + 0);
	System.out.println("Hi = " + (sh.length-1));

	System.out.println(Arrays.toString(sh));
	sh[0] = 10;
	System.out.println(Arrays.toString(sh));
	sh[2] = 30;
	System.out.println(Arrays.toString(sh));
	sh[1] = 40;
	System.out.println(Arrays.toString(sh));
	
	for(int p=0; p<sh.length; p++) {
		System.out.println(sh[p]);//10 40 30
	}
}
}
