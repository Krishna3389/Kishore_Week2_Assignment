package assignment2;

public class AdditionMain {

	public static void main(String[] args) {
		Addition a=new Addition(10, 20);
		  System.out.println(" Sum of two numbers = "+a.add());
		  System.out.println("Sum of two doubles ="+a.add(5.0, 7.0));
		  System.out.println("Sum of three numbers ="+a.add(5, 6, 7));
	}

}
