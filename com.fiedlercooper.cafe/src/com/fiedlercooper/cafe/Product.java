package com.fiedlercooper.cafe;

abstract class Product {

	private String name;
	private double price;
	private String description;
	private int quantity;

	public Product() {

	}

	public Product(String name, double price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getDescription() {
		return description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	abstract double calculateProductTotal(int quantity, double price);

	abstract void addOptions();

	abstract void printOptions();

}
