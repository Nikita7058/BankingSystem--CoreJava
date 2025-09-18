package banking;

public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingsAccount sa = new SavingsAccount(123, "Nikita", 2000);
		sa.deposite(500);
		
		sa.withdraw(2000);
		
		sa.withdraw(30000);
		

        System.out.println("-----------------------");

		
		CurrentAccount ca = new CurrentAccount(321,"Ajit", 300);
		 ca.deposite(1000);
	        ca.withdraw(700);   // valid (within overdraft)
	        ca.withdraw(100);
	}

}
