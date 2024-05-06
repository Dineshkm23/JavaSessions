package ExceptionHandling;

public class methodToMethod {

	public void m1()
	{
		m2();
		System.out.println("M1 method");
	}
	public void m2()
	{
		System.out.println("M2 method");
		try {
		m3();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public void m3() throws Exception	{
		System.out.println("M3 method");
		int i=1/0;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodToMethod met=new methodToMethod();
		met.m1();
		
	}

}
