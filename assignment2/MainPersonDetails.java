package assignment2;

public class MainPersonDetails {

	public static void main(String[] args) {
		PersonDetails details=new PersonDetails("kishore", 23, 96546756l, 40000.0,"Amalapuram");
		details.displayname();
		details.age();
		details.displayphno();
		details.displaysalary();	
		details.displayaddress();
		
	}

}
