package Main;

public class Employee {

	private String firstName;
	private String lastName;
	private long employeeId;
	private String jobTitle;
	
	public Employee() {
		
	}

	public Employee(String firstName, String lastName, long employeeId, String jobTitle) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.jobTitle = jobTitle;
	}

	// GETTERS AND SETTERS

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee [" + "firstName = " + firstName + ", lastName = " + lastName + ", employeeId = " + employeeId
				+ ", jobTitle = " + jobTitle + "]";
	}

}
