package javasessionpractice;

public class FinalKeyWord {
	final int i=10;
	public static void main(String[] args) {
		
		final int i=20;
		FinalKeyWord fk= new FinalKeyWord();
		System.out.println(fk.i);
		System.out.println(i);
		
		System.out.println(i);
	}
}
