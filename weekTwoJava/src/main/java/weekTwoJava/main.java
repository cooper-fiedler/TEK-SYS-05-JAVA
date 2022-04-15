package weekTwoJava;

import java.util.Scanner;

public class main {
	/*
	 * STARTING POINT
	 * 
	 * RUNNER
	 * 
	 * 
	 * SLIDE 11
	 */
	public static void main(String[] args) {

		String name = "Cooper";
		System.out.println("Hello, " + name);
		int number = 120;
		Integer testNum = 203;
		double radius;
		double area;
		radius = 20;
		area = radius * radius * 3.14159;
		System.out.println("The area is " + area + " square feet.");
		char a = 'b';
		float payCheck = 1234.89f;
		byte byteNumber = 56;
		long longNumber = 4564456;
		boolean testBool = true;

		int x = 5;
		System.out.println(x * 5);
		System.out.println(x / 5);
		System.out.println(x - 3);
		System.out.println(x % 3);

		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String firstname = userInput.nextLine();
		System.out.println(firstname.toUpperCase());

		userInput.close();
	}

}