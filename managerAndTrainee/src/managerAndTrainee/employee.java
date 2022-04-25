package managerAndTrainee;

public class employee {
	private static long employeeId;
	private static String employeeName;
	private static String employeeAddress;
	private static long employeePhone;
	protected static double basicSalary;
	static double specialAllowance = 250.80;
	static double hra = 1000.50;

	protected long getEmployeeId() {
		return employeeId;
	}

	protected void setEmployeeId(long Id) {
		employee.employeeId = Id;
	}

	protected String getEmployeeName() {
		return employeeName;
	}

	protected void setEmployeeName(String Name) {
		employee.employeeName = Name;
	}

	protected String getEmployeeAddress() {
		return employeeAddress;
	}

	protected void setEmployeeAddress(String address) {
		employee.employeeAddress = address;
	}

	protected long getEmployeePhone() {
		return employeePhone;
	}

	protected void setEmployeePhone(long phone) {
		employee.employeePhone = phone;
	}

	public void calculateSalary() {
		double salary = basicSalary + (basicSalary * specialAllowance / 100) + basicSalary * hra / 100;
		System.out.println(salary);
	}

	public double calculateTransportAllowance() {
		double transportAllowance = 10 / 100 * basicSalary;
		return transportAllowance;
	}

}
