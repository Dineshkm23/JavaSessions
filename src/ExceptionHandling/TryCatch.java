package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Try catch testing");
		
		try {
			System.out.println("Inside the Try block");
			int i=9/0;
			System.out.println("End of try block");
			
		} 
		
		//Throwable is the parent class of Exception and Error class
		//catch (Exception e) {
			catch (ArithmeticException e) {
			System.out.println("Inside th catch block");
			e.printStackTrace();
		}
		
		System.out.println("came out from try catch block");
		
	}

}
