package Main;

public class Main {

	public static void main(String[] args) {

		Employee employeeOne = new Employee("Cooper", "Fiedler", 75315, "Software Engineer");
		Employee employeeTwo = new Employee("Jeffrey", "Doe", 75316, "Software Engineer");
		Manager managerOne = new Manager("Jennifer", "Lopez", 153, "Director of Technology", "45");
		Employee e3 = new Employee();

		e3.setEmployeeId(1562);
		e3.setFirstName("Charlie");
		e3.setLastName("Brown");
		e3.setJobTitle("Senior Software Engineer");

		System.out.println("Employees " + employeeOne.getFirstName() + " and " + employeeTwo.getFirstName()
				+ " are both " + employeeOne.getJobTitle() + "s and they report to " + managerOne.getFirstName() + " "
				+ managerOne.getLastName() + ".");

	}

}





