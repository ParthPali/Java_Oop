package inheritance_Polymorph_Encapsule;

public class Bank1 extends Superclass {
	
	int budget;
	
	public Bank1(int accountNumber, int amount, int budget) {
		super(accountNumber, amount, budget);
		this.budget = budget;
	}

	public int getAmount() {
		return amount-budget;
		//amount after savings
	}

}
