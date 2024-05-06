package javasessionpractice;

public class Car {
	
	String name;
	String licenseNumber;
	Double price;
	String color;
	int wheels;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1= new Car();
		c1.name="BMW";
		c1.licenseNumber="6767575";
		c1.price=455500.00;
		c1.color="red";
		c1.wheels=4;
		
		
		Car c2=new Car();
		c2.name="Audi";
		c2.licenseNumber="6888575";
		c2.price=566600.00;
		c2.color="white";
		c2.wheels=4;	
		
		
		Car c3=new Car();
		c3.name="Toyato";
		c3.licenseNumber="3434343";
		c3.price=343434.00;
		c3.color="Yellow";
		c3.wheels=4;
		
		System.out.println(c1.name+" "+c1.licenseNumber+" "+c1.price+" "+c1.color+" "+c1.wheels);
		System.out.println(c2.name+" "+c2.licenseNumber+" "+c2.price+" "+c2.color+" "+c2.wheels);
		System.out.println(c3.name+" "+c3.licenseNumber+" "+c3.price+" "+c3.color+" "+c3.wheels);
		
		System.out.println("______________________________");
		
		c1=c2;
		System.out.println(c1.name+" "+c1.licenseNumber+" "+c1.price+" "+c1.color+" "+c1.wheels);
		System.out.println(c2.name+" "+c2.licenseNumber+" "+c2.price+" "+c2.color+" "+c2.wheels);
		System.out.println(c3.name+" "+c3.licenseNumber+" "+c3.price+" "+c3.color+" "+c3.wheels);
	
		System.out.println("______________________________");	
		
		c2=c3;
		System.out.println(c1.name+" "+c1.licenseNumber+" "+c1.price+" "+c1.color+" "+c1.wheels);
		System.out.println(c2.name+" "+c2.licenseNumber+" "+c2.price+" "+c2.color+" "+c2.wheels);
		System.out.println(c3.name+" "+c3.licenseNumber+" "+c3.price+" "+c3.color+" "+c3.wheels);
	
	
	
	}

}
