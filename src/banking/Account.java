package banking;

public abstract class Account {

	int accountNumber;
	String name;
	double balance;
	
	Account(int accountNumber, String name, double balance ){
		this.accountNumber=accountNumber;
		this.name=name;
		this.balance=balance;
	}
	
	void deposite(double amount) {
		balance+=amount;
		System.out.println("Deposited "+amount+" Balance "+balance);
		
	}
	abstract void withdraw(double amount);

}

