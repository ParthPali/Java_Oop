package inheritance_Polymorph_Encapsule;

public class Superclass {
	
	int accountNumber;
	int amount;
	int budget;
	
	public Superclass(int accountNumber, int amount, int budget) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.budget = budget;
	}
	
	public Superclass(int accountNumber, int amount){
		this.accountNumber = accountNumber;
		this.amount = amount;
		budget = 0;
	}

	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
