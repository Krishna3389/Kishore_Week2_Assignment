package assignment2;

public class BankAccountMain {

	public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); 
        account.displayBalance();  

        account.deposit(500);      
        account.displayBalance();  
        account.withdraw(4000);     
        account.displayBalance();  

        account.withdraw(1000);    
        account.displayBalance(); 

}
}
