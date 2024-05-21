package javasessionpractice;

public class IncreDecrPractice {
	
	public static void main(String[] args) {
		
		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b;
		//11+22+11+22+13+24
		System.out.println(11+22+11+22+13+24);
		System.out.println(c);
		
		
//		int i = 0;
//		int j = i++ - --i + ++i - i--;
//		//0-0+1-1
//		System.out.println(0-0+1-1);
//		System.out.println(j);
		
		int i = 19, j = 29, k=0;
		int m = i-- - j-- - k--;
		
		//19-18-0
		System.out.println(19-18-0);
		
		System.out.println("i=" + i);

		System.out.println("j=" + j);

		System.out.println("k=" + k);
		
		
	}
}
