package com.perscholas.cafe;

import java.util.ArrayList;
import java.util.Scanner;

public class CafeApp {

	public static void main(String[] args) {
		double salesTax = 3.00;
		
		boolean shopping = true;
		
		Coffee coffee = new Coffee(false, false);
		Espresso espresso = new Espresso(false, false);
		Cappuccino cappuccino = new Cappuccino(false, false);
		
		coffee.setQuantity(0);
		espresso.setQuantity(0);
		cappuccino.setQuantity(0);
		
		
		Scanner order = new Scanner(System.in);
		
		ArrayList<Product> shoppingCart = new ArrayList<Product>();
		
	
		
		while (shopping) {
			System.out.println("Please select from the following menu: \n1: Coffee\n2: Cappuccino\n3: Espresso\n4: Checkout\n");
			int selection = order.nextInt();
			
			if (selection == 1) {
				coffee.addOptions();
				coffee.printOptions();
				//shoppingCart.add(coffee);
				//coffee.setQuantity(coffee.getQuantity()+1);
			}else if (selection == 2) {
				espresso.addOptions();
				shoppingCart.add(espresso);
				espresso.setQuantity(espresso.getQuantity()+1);
			}else if (selection == 3) {
				cappuccino.addOptions();
				shoppingCart.add(cappuccino);
				cappuccino.setQuantity(cappuccino.getQuantity()+1);
			}else if (selection == 4) {
				shopping = false;
			}else {
				System.out.println("Not a valid input!");
			}
		}
		order.close();
		



		double subtotal = 0;

		for (Product p : shoppingCart) {
			int indivQuantity = 1;
			subtotal += p.calculateProductTotal(indivQuantity, p.getPrice());
			System.out.format("Name: %s  |  Description: %s   | Product Subtotal: %,.2f\n\n", p.getName(),
					p.getDescription(), p.calculateProductTotal(indivQuantity, p.getPrice()));
		}
	

		System.out.println("Subtotal: " + subtotal);
		System.out.println("Sales Tax: " + salesTax);
		System.out.println("Total: " + (subtotal + salesTax));
	}

}
