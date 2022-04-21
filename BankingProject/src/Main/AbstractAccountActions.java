package Main;

public abstract class AbstractAccountActions {
	float bankAccount;

	public AbstractAccountActions() {

	}

	public AbstractAccountActions(float bankAccount) {
		this.bankAccount = bankAccount;
	}

	abstract float withdraw(float amount, float withdrawAmount);

	abstract float deposit(float amount, float depositAmount);

	public float getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(float bankAccount) {
		this.bankAccount = bankAccount;
	}

}
