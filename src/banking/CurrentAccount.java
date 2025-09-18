package banking;

public class CurrentAccount extends Account {

	double overDeaftLimit=1000;
	
	CurrentAccount(int accountNumber, String name, double balance){
		super(accountNumber, name, balance);
	}
	void withdraw(double amount) {
		if(balance+overDeaftLimit>amount) {
			balance=balance-amount;
			System.out.println("Wthdraw "+amount +" balance "+balance);
		}else {
			System.out.println("Withdrawal denied. Exceeds overdraft limit of \" + overdraftLimit");
		}
	}
}
