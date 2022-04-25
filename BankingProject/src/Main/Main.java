package Main;

public class Main {

	public static void main(String[] args) {

		int withdrawAmmount;

		Employee e3 = new Employee("Charlie", "Brown", 1562, "Senior Software Engineer");

		e3.setBankAccount(5000);
		withdrawAmmount = 1000;

		System.out.println(e3.getFirstName() + " " + e3.getLastName() + "'s " + "Current Account Balance: " + e3.getBankAccount());

		try {

			if (e3.getBankAccount() < withdrawAmmount) {
				//System.out.println("New Balance: " + (e3.getBankAccount() - withdrawAmmount));
				throw new negativeBalanceException();

			} else {
				System.out.println("Withdraw completed successfully with no exceptions!");
				e3.setBankAccount(e3.withdraw(e3.getBankAccount(), withdrawAmmount));
			}

		} catch (negativeBalanceException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("New Balance: " + e3.getBankAccount());

//		Box<Integer> intBox = new Box<Integer>();
//		intBox.add(1);
//		intBox.add(2);
//		intBox.add(3);
//		intBox.add(4);
//		
//		System.out.println(intBox.get());
//		
//		Box<String> strBox = new Box<String>();
//		strBox.add("Cooper");
//		strBox.add("S");
//		strBox.add("Fiedler");
//		
//		System.out.println(strBox.get());
//		
//		Manager m1 = new Manager();
//		m1.PrintThis(1,2,3);
//		
//		String str = "CHECKING";
//		Accounts accOne = new Accounts(AccountTypes.valueOf(str));
//		accOne.choseAccount();

	}

}






