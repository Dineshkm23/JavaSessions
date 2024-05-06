package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data=null;
		try {
		if(data==null)
		{
			throw new Exception("data is null");
		}
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
