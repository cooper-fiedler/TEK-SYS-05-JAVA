package Main;

public abstract class AbstractAccountActions {
	String bankAccount;

	
	public AbstractAccountActions() {
		
	}
	
	public AbstractAccountActions(String bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	abstract float withdraw(int amount, int withdrawAmount);
	abstract float deposit(int amount, int depositAmount);
	
	public String getBankAccount() {
		return bankAccount;
	}
	
}
