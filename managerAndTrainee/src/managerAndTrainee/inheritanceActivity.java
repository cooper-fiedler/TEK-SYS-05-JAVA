package managerAndTrainee;

public class inheritanceActivity {
	static manager manager = new manager();
	static trainee trainee = new trainee();

	public static void main(String[] args) {

		testCase1(); // MANAGER SALARY
		testCase2(); // TRAINEE SALARY

	}

	public static void testCase1() {

		manager.setEmployeeId(126534);
		manager.setEmployeeName("Peter");
		manager.setEmployeeAddress("Chennai India");
		manager.setEmployeePhone(237844);
		manager.setBasicSalary(65000);
		manager.calculateSalary();
		System.out.println(manager.calculateTransportAllowance());

	}

	public static void testCase2() {

		trainee.setEmployeeId(29846);
		trainee.setEmployeeName("Jack");
		trainee.setEmployeeAddress("Mumbai India");
		trainee.setEmployeePhone(442085);
		trainee.setBasicSalary(45000);
		trainee.calculateSalary();
		System.out.println(trainee.calculateTransportAllowance());
		

	}
}
