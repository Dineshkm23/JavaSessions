package javasessionpractice;

public class MaxNumberUsingSingleAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 102320;
		int b = 12223;
		int c = 3444;
		int d = 52300;
	
	
		if (a>b & a>c & a>d) 
		{
			System.out.println("A is greater");
		} 
		else if(b>c & b>d) 
		{
			System.out.println("B is greater");
		} 
		else if (c>d){
			System.out.println("C is gretaer");
			
		}else {
			System.out.println("D is greater");
		}

	}
}
