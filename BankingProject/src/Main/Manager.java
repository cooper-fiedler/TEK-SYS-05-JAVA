package Main;

public class Manager extends Employee {

	private String timeCards;

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
		return "Manager [getFirstName() = " + getFirstName() + " , getLastName() = "
				+ getLastName() + ", getEmployeeId() = " + getEmployeeId() + ", getJobTitle() = " + getJobTitle() + ", timeCards = " + timeCards + "]";
	}

	

}
