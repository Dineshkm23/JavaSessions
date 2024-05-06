package ExceptionHandling;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser="ie";
				
			if(browser.equals("chrome"))
			{
				System.out.println("Chrome");
			}
			else if (browser.equals("firefox"))
			{
				System.out.println("firefox");
			}
			else if (browser.equals("edge"))
			{
				System.out.println("edge");
			}
			else if (browser.equals("webkit"))
			{
				System.out.println("webkit");
			} else
			{
				System.out.println("pass right browser");
				throw new MyException("Pass correct browser");
			}
		
		
	}

}
