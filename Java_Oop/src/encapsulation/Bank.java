package encapsulation;

public class Bank {
	
	private int accountNumber;
	private int amount;
	private int budget;
	
	public Bank(int accountNumber, int amount, int budget) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.budget = budget;
	}

	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public int getBudget() {
		return budget;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
}
