package javasessionpractice;

import java.util.Arrays;

public class ArrayConcepts1 {
	public static void main(String[] args) {
		
		int i[]=new int[5];
		
		i[0]=10;
		i[1]=30;
		i[2]=40;
		i[3]=50;
		i[4]=20;
		
	
		System.out.println(Arrays.toString(i));
		
		for(int k=0;k<= i.length-1;k++) {
			System.out.println(i[k]);
		}
		
		
		short[] sh= new short[5];
		sh[0]=10;
		sh[1]=20;
		sh[2]=30;
		sh[3]=40;
		sh[4]=50;
		
		System.out.println(Arrays.toString(sh));
	
		
		Object empData[]= new Object[4];
		empData[0]="Dinesh";
		empData[1]=300;
		empData[2]= 'A';
		empData[3]=300.00f;
		
		System.out.println(Arrays.toString(empData));
		
	}
	
}
