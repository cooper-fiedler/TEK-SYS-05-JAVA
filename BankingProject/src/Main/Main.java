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


		e3.setBankAccount(325);
		e3.setBankAccount(e3.deposit(e3.getBankAccount(), 110));
		System.out.println("Bank Account value for " + e3.getFirstName() + " " + e3.getLastName() + ": " + e3.getBankAccount());
		
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.add(1);
		intBox.add(2);
		intBox.add(3);
		intBox.add(4);
		
		System.out.println(intBox.get());
		
		Box<String> strBox = new Box<String>();
		strBox.add("Cooper");
		strBox.add("S");
		strBox.add("Fiedler");
		
		System.out.println(strBox.get());
		
		managerOne.PrintThis(1,2,3);
		
		String str = "CHECKING";
		Accounts accOne = new Accounts(AccountTypes.valueOf(str));
		accOne.choseAccount();
		
	}

}
