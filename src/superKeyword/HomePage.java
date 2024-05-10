package superKeyword;

public class HomePage extends webPage {
	
	public int i=50;
	
	
	public HomePage()
	{
		System.out.println("HomePage default constructor");
	}
	
	
		
	@Override
	public void calculateTimeOut()
	{
		System.out.println("hp ---calculateTimeOut");
	}
	

}
