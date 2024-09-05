package assignment2;

public class PersonDetails {
	String name;
	int age;
	long phno;
	double salary;
	String address;
	public PersonDetails(String name, int age, long phno, double salary, String address) {
		super();
		this.name = name;
		this.age = age;
		this.phno = phno;
		this.salary = salary;
		this.address = address;
	}
	public void displayname()
	{
		System.out.println(" name  :"+name  );
	}
	public void age()
	{
		System.out.println( " age "+ age);
	}
	public void displaysalary()
	{
		System.out.println( "salary  "+salary);
	}
	public void displayphno()
	{
		System.out.println("phone number "+phno);	
	}
	public void displayaddress()
	{
		System.out.println("address "+address);
	}

}
