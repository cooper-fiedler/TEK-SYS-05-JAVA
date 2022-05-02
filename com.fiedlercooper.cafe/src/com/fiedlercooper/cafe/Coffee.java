package com.fiedlercooper.cafe;

import java.util.Scanner;

public class Coffee extends Product {

	boolean sugar;
	boolean milk;

	public Coffee() {
		super("Coffee", 4.50, "Just a simple cup of coffee");
	}

	public Coffee(boolean sugar, boolean milk) {
		super("Coffee", 4.50, "Just a simple cup of coffee");
		this.sugar = sugar;
		this.milk = milk;
	}

	public boolean isSugar() {
		return sugar;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setSugar(boolean sugar) {
		this.sugar = sugar;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	@Override
	double calculateProductTotal(int quantity, double price) {

		return quantity * price;
	}

	@Override
	void addOptions() {
		
		
		Scanner optionInput = new Scanner(System.in);
		
		System.out.println("Do you want Milk?");
		String option1 = optionInput.nextLine();
		System.out.println("Do you want Sugar?");
		String option2 = optionInput.nextLine();
		
		this.milk = option1.equalsIgnoreCase("Yes");
		this.sugar = option2.equalsIgnoreCase("Yes");
		


	}
	
	@Override
	void printOptions() {
		String sugar;
		String milk;

		if (this.sugar) {
			sugar = "Yes";
		} else {
			sugar = "No";
		}

		if (this.milk) {
			milk = "Yes";
		} else {
			milk = "No";
		}

		System.out.format("|  Milk: %-31s|  Sugar: %-20s", milk, sugar);
	}

}
