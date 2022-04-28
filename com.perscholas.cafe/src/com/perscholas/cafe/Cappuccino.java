package com.perscholas.cafe;

import java.util.Scanner;

public class Cappuccino extends Product {

	boolean peppermint;
	boolean whippedCream;

	public Cappuccino() {
		super("Cappuccino", 5.50, "Espresso and milk and milk foam");
		this.peppermint = false;
		this.whippedCream = false;
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
		Scanner cappuccinoScanner = new Scanner(System.in);
		System.out.println("Would you like an extraShot?");
		String peppermint = cappuccinoScanner.nextLine();
		System.out.println("Would you like a macchiato?");
		String whippedCream = cappuccinoScanner.nextLine();

		cappuccinoScanner.close();

		if (peppermint == "Y") {
			this.peppermint = true;
		}

		if (whippedCream == "Y") {
			this.whippedCream = true;
		}

	}

	@Override
	void printOptions() {
		String peppermint;
		String whippedCream;

		if (this.peppermint == true) {
			peppermint = "Yes (Add $2)";
		} else {
			peppermint = "No";
		}

		if (this.whippedCream == true) {
			whippedCream = "Yes (Add $1)";
		} else {
			whippedCream = "No";
		}

		System.out.println("Peppermint: " + peppermint + "   |    Whipped Cream: " + whippedCream); 
	}

}
