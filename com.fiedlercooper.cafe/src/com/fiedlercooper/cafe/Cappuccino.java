package com.fiedlercooper.cafe;

import java.util.Scanner;

public class Cappuccino extends Product {

	boolean peppermint;
	boolean whippedCream;

	public Cappuccino() {
		super("Cappuccino", 5.50, "Espresso and milk and milk foam");
	}

	public Cappuccino(boolean peppermint, boolean whippedCream) {
		super("Cappuccino", 5.50, "Espresso and milk and milk foam");
		this.peppermint = peppermint;
		this.whippedCream = whippedCream;

	}

	public boolean isPeppermint() {
		return peppermint;
	}

	public boolean isWhippedCream() {
		return whippedCream;
	}

	public void setPeppermint(boolean peppermint) {
		this.peppermint = peppermint;
	}

	public void setWhippedCream(boolean whippedCream) {
		this.whippedCream = whippedCream;
	}

	@Override
	double calculateProductTotal(int quantity, double price) {
		double adderTotal = 0;

		if (peppermint) {
			adderTotal += 2.00;
		}
		if (whippedCream) {
			adderTotal += 1.00;
		}

		return quantity * (price + adderTotal);
	}

	@Override
	void addOptions() {

		Scanner optionInput = new Scanner(System.in);

		System.out.println("Do you want Peppermint?");
		String option1 = optionInput.nextLine();
		System.out.println("Do you want Whipped Cream?");
		String option2 = optionInput.nextLine();
		this.peppermint = option1.equalsIgnoreCase("Yes");
		this.whippedCream = option2.equalsIgnoreCase("Yes");
		

	}

	@Override
	void printOptions() {
		String peppermint;
		String whippedCream;

		if (this.peppermint) {
			peppermint = "Yes (Add $2)";
		} else {
			peppermint = "No";
		}

		if (this.whippedCream) {
			whippedCream = "Yes (Add $1)";
		} else {
			whippedCream = "No";
		}

		System.out.format("|  Peppermint: %-25s|  Whipped Cream: %-20s", peppermint, whippedCream);
	}

}
