package encapsulation;

public class EncapsulationTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank(1234, 100, 50);
		
		System.out.println(bank.getAccountNumber());
		bank.setAccountNumber(9876);
		System.out.println(bank.getAccountNumber());
		
		System.out.println(bank.getAmount());
		bank.setAmount(200);
		System.out.println(bank.getAmount());
		
		System.out.println(bank.getBudget());
		bank.setBudget(100);
		System.out.println(bank.getBudget());
	}

}
