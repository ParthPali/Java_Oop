package inheritance_Polymorph_Encapsule;

public class Superclass {
	
	int accountNumber;
	int amount;
	
	public Superclass(int accountNumber, int amount, int budget) {
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

}
