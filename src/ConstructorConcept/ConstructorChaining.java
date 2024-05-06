package ConstructorConcept;

public class ConstructorChaining {

	String name;
	int age;
	String dob;
	int salary;
	
	
	public ConstructorChaining()
	{
		
		System.out.println("default ConstructorChainingz");
		
	}
	public ConstructorChaining(String name,int age)
	{
		this("kumar",40,10000);
		this.name=name;
		this.age=age;
		System.out.println("default ConstructorChainingz String name,int age ");
		System.out.println(name+" "+age);
		
		
	}
	public ConstructorChaining(String name, int age, int salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		System.out.println(name+" "+age+" "+salary);
		System.out.println("default ConstructorChainingz String name, int age, int salary");	
	}
	
	public ConstructorChaining(String name, int age, int salary, String dob)

	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.dob=dob;
		System.out.println("default ConstructorChainingz String name,double dob");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ConstructorChaining cc=new ConstructorChaining("Dinesh",40,3000,"10/12/1993");
		System.out.println(cc.name);
		System.out.println(cc.age);
		System.out.println(cc.dob);
		System.out.println(cc.salary);
	}

}
