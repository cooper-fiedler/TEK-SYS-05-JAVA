package connection.JDBC;

public class EmployeeModel {
	int employeeNumber;
	String firstName;
	String lastName;
	String jobTitle;
	String extension;

	public EmployeeModel() {

	}

	public EmployeeModel(int employeeNumber, String firstName, String lastName, String jobTitle, String extension) {
		super();
		this.employeeNumber = employeeNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.extension = extension;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public String getExtension() {
		return extension;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

}
