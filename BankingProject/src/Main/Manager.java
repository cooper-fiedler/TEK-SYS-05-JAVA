package Main;

public class Manager extends Employee implements AccountActionsIMPL {

	private String timeCards;
	private float TotalAmount;

	public Manager() {

	}

	public Manager(String firstName, String lastName, long employeeId, String jobTitle, String timeCards) {
		super(firstName, lastName, employeeId, jobTitle);
		this.timeCards = timeCards;

	}

	public String getTimeCards() {
		return timeCards;
	}

	public void setTimeCards(String timeCards) {
		this.timeCards = timeCards;
	}

	@Override
	public String toString() {
		return "Manager [getFirstName() = " + getFirstName() + " , getLastName() = " + getLastName()
				+ ", getEmployeeId() = " + getEmployeeId() + ", getJobTitle() = " + getJobTitle() + ", timeCards = "
				+ timeCards + "]";
	}

	@Override
	public float Withdraw(float Amount, float WithdrawAmount) {
		TotalAmount = Amount - WithdrawAmount;
		return TotalAmount;
		
	}

	@Override
	public float Deposit(float Amount, float DepositAmount) {
		TotalAmount = Amount + DepositAmount;
		return TotalAmount;
		
	}

	public void PrintThis(int ...val) {
		for(int i : val) {
			System.out.println(i);
		}
	}
	
}
