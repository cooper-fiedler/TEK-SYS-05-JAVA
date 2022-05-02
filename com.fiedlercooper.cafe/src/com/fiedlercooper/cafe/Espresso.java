package com.fiedlercooper.cafe;

import java.util.Scanner;

public class Espresso extends Product {

	boolean extraShot;
	boolean macchiato;

	public Espresso() {
		super("Espresso", 3.50, "Plain espresso");
	}

	public Espresso(boolean extraShot, boolean macchiato) {
		super("Espresso", 3.50, "Plain espresso");
		this.extraShot = extraShot;
		this.macchiato = macchiato;

	}

	public boolean isExtraShot() {
		return extraShot;
	}

	public boolean isMacchiato() {
		return macchiato;
	}

	public void setExtraShot(boolean extraShot) {
		this.extraShot = extraShot;
	}

	public void setMacchiato(boolean macchiato) {
		this.macchiato = macchiato;
	}

	@Override
	double calculateProductTotal(int quantity, double price) {

		double adderTotal = 0;

		if (extraShot) {
			adderTotal += 2.00;
		}
		if (macchiato) {
			adderTotal += 1.00;
		}

		return quantity * (price + adderTotal);
	}

	@Override
	void addOptions() {

		Scanner optionInput = new Scanner(System.in);

		System.out.println("Do you want an Extra Shot?");
		String option1 = optionInput.nextLine();
		System.out.println("Do you want a Macchiato?");
		String option2 = optionInput.nextLine();
		this.extraShot = option1.equalsIgnoreCase("Yes");
		this.macchiato = option2.equalsIgnoreCase("Yes");
		


	}

	@Override
	void printOptions() {
		String extraShot;
		String macchiato;

		if (this.extraShot) {
			extraShot = "Yes (Add $2)";
		} else {
			extraShot = "No";
		}

		if (this.macchiato) {
			macchiato = "Yes (Add $1)";
		} else {
			macchiato = "No";
		}

		System.out.format("|  Extra Shot: %-25s|  Macchiato: %-20s", extraShot, macchiato);
	}

}
