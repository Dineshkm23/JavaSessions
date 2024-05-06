package javasessionpractice;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=100;
		int b=900;
		int c=600;
		int d=9500;
		
		if (a>b && a>c && a>d) {
			System.out.println("A is greater");
		} 
		else if (b>c && b>d){
			System.out.println("B is greater");
		}
			else if (c>d) {
				System.out.println("C is greater");
		}
			else {
		System.out.println("D is greater");
	}
	}

}
