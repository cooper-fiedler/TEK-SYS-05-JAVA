package com.perscholas.cafe;

import java.util.Scanner;

public class Espresso extends Product {

	boolean extraShot;
	boolean macchiato;

	public Espresso() {
		super("Espresso", 3.50, "Plain espresso");
		this.extraShot = false;
		this.macchiato = false;
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
		Scanner espressoScanner = new Scanner(System.in);
		System.out.println("Would you like an extraShot?");
		String extraShot = espressoScanner.nextLine();
		System.out.println("Would you like a macchiato?");
		String macchiato = espressoScanner.nextLine();

		espressoScanner.close();

		if (extraShot == "Y") {
			this.extraShot = true;
		}

		if (macchiato == "Y") {
			this.macchiato = true;
		}
	}
	
	@Override
	void printOptions() {
		String extraShot;
		String macchiato;
		
		if (this.extraShot == true) {
			extraShot = "Yes (Add $2)";
		}else {
			extraShot = "No";
		}
		
		if (this.macchiato == true) {
			macchiato = "Yes (Add $1)";
		}else {
			macchiato = "No";
		}
		
		System.out.println("Extra Shot: " + extraShot + "   |    Macchiato: " + macchiato); 
	}

}
