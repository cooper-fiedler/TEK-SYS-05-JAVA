package libraryProject;

public class LibraryInterfaceDemo {

	static KidUser kidUser = new KidUser();
	static AdultUser adultUser = new AdultUser();

	public static void main(String[] args) {

		testCase1();
		testCase2();

	}

	public static void testCase1() {

		kidUser.setAge(10);
		kidUser.registerAccount();
		kidUser.setAge(18);
		kidUser.registerAccount();
		kidUser.setBookType("kids");
		kidUser.requestbook();
		kidUser.setBookType("fiction");
		kidUser.requestbook();
	}

	public static void testCase2() {

		adultUser.setAge(5);
		adultUser.registerAccount();
		adultUser.setAge(23);
		adultUser.setBookType("kids");
		adultUser.requestbook();
		kidUser.setBookType("fiction");
		adultUser.requestbook();

	}

}