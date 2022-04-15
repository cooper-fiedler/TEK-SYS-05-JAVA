package coreJavaBasics;

public class main {

	public static void main(String[] args) {
// Question 1
		int variableInteger = 12;
		int variableInteger2 = 15;

		int sumInteger = variableInteger + variableInteger2;
		System.out.println(sumInteger);

// Question 2		
		double variableDouble = 12.6;
		double variableDouble2 = 15.1;

		double sumDouble = variableDouble + variableDouble2;
		System.out.println(sumDouble);

// Question 3
		double variableDouble3 = 12.6;
		int variableInteger3 = 15;

		double sumDouble2 = variableDouble3 + variableInteger3;
		System.out.println(sumDouble2);

// Question 4
		double variableDouble4 = 5.2;
		int variableInteger5 = 15;

		double quotientDouble = variableInteger5 / variableDouble4;
		System.out.println(quotientDouble);

// Question 5
		double variableDouble5 = 4.6;
		double variableDouble6 = 19.1;

		double quotientDouble2 = variableDouble6 / variableDouble5;
		System.out.println((int) quotientDouble2);

// Question 6
		int x = 5;
		int y = 6;
		int q = y / x;

		System.out.println(q);

		double q2 = (double) y / x;
		System.out.println(q2);

// Question 7
		final int CONSTANT_VALUE = 9;
		System.out.println(CONSTANT_VALUE / 3);

// Question 8
		double cappuccino = 4.50;
		double espresso = 3.75;
		double greenTea = 3.50;

		final double SALES_TAX = 2.50;

		double subtotal = (3 * cappuccino) + (4 * espresso) + (greenTea * 2);
		double totalSale = subtotal + SALES_TAX;
		System.out.println(totalSale);
		
	}

}
