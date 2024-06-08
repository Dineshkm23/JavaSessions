package javasessionpractice;

public class FunctionTest {

	public int getMarks(String name) {
		System.out.println("Student name is:"+name);
		
		switch(name.toLowerCase().trim())
		{
		case "dinesh":
			return 94;
			
		case "ambuja":
			return 100;
		default:
			return -1;
		}
	}
	
	public static int getStudentMarks(String name) {
		System.out.println("Student name :"+name);
		int marks=-1;
		if (name.equalsIgnoreCase("dinesh")){
			marks=95;
		}
		else if (name.equalsIgnoreCase("Ambuja")) {
			marks=100;
		}else {

			System.out.println("student name not found...plz pass the right student name " + name);
		}
		
		return marks;
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int mark=FunctionTest.getStudentMarks("ambuja");
	System.out.println("Marks:"+mark);
	
	FunctionTest ft= new FunctionTest();
	System.out.println("Student marks:"+ft.getMarks("ambuja"));
	
	}

}
