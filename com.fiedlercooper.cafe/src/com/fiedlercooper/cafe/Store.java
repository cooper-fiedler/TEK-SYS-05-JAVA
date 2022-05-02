package com.fiedlercooper.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
	
	boolean shopping = true;
		
		
	public ArrayList<Product> shopAtStore() {
		boolean shopping = this.shopping;

		Scanner order = new Scanner(System.in);

		ArrayList<Product> shoppingCart = new ArrayList<Product>();

		while (shopping) {
			System.out.println(
					"Please select from the following menu: \n1: Coffee\n2: Espresso\n3: Cappuccino\n4: Checkout\n");
			int selection = order.nextInt();

			if (selection == 1) {
				Coffee coffee = new Coffee();
				coffee.addOptions();
				shoppingCart.add(coffee);
				coffee.setQuantity(coffee.getQuantity() + 1);
			} else if (selection == 2) {
				Espresso espresso = new Espresso();
				espresso.addOptions();
				shoppingCart.add(espresso);
				espresso.setQuantity(espresso.getQuantity() + 1);
			} else if (selection == 3) {
				Cappuccino cappuccino = new Cappuccino();
				cappuccino.addOptions();
				shoppingCart.add(cappuccino);
				cappuccino.setQuantity(cappuccino.getQuantity() + 1);
			} else if (selection == 4) {
				shopping = false;
			} else {
				System.out.println("Not a valid input!");
			}
		}
		order.close();
		return shoppingCart;
	}
	
	public void checkOut(ArrayList<Product> shoppingCart) {
		double subtotal = 0;

		for (Product p : shoppingCart) {
			int indivQuantity = 1;
			subtotal += p.calculateProductTotal(indivQuantity, p.getPrice());
			System.out.format("|  Name: %-15s|  Description: %-35s|  Product Subtotal: $%,.2f\n", p.getName(),
					p.getDescription(), p.calculateProductTotal(indivQuantity, p.getPrice()));
			p.printOptions();
			System.out.println("\n");
		}
		
		double salesTax = 0.05 * subtotal;

		System.out.format("Subtotal: $%,.2f\nSales Tax: $%,.2f\nTotal: $%,.2f", subtotal, salesTax,
				(subtotal + salesTax));
	}
}
