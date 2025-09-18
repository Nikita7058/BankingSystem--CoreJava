package banking;

public class SavingsAccount extends Account{

	double minBalance=500;
	SavingsAccount(int accountNumber, String name, double balance ){
		super(accountNumber, name, balance);
	}
	void withdraw(double amount) {
		if(balance-amount>=minBalance) {
			balance-=amount;
			System.out.println("Withdraw "+amount+" Balance "+balance);
		}else {
			System.out.println("Access denide must contain minBalance "+minBalance);
		}
	}
}
