package Main;

enum AccountTypes {
	CHECKING, SAVINGS, CREDIT
}

public class Accounts {
	// REF OF THE ENUM
	AccountTypes accountTypes;

	// CLASS CONSTRUCTOR
	public Accounts(AccountTypes accountTypes) {
		this.accountTypes = accountTypes;
	}

	// METHOD TO CHOOSE ACCOUNT TYPES
	public void choseAccount() {
		switch (accountTypes) {
		case CHECKING:
			System.out.println("You Chose a Checking Account.");
			break;
		case SAVINGS:
			System.out.println("You Chose a Savings Account.");
			break;
		case CREDIT:
			System.out.println("You Chose a Credit Account.");
			break;
		}

	}

}
