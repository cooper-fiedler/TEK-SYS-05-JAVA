package com.example;

public class Item {
	
	private String itemName; // Name of the item
    private String itemDesc; // Contains the item's description
    private Double itemPrice; // Contains a double value which represents the item’s price
    private Integer quantity; // Represents the number of items the user has added to the cart
    private Integer availableQuantity; // Represents the number of items of a type  available in the system
    
    public Item() {
    	this.quantity = 1;
    }
    
    
	public Item(String itemName, String itemDesc, Double itemPrice, Integer availableQuantity) {
		this.quantity = 1;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.itemPrice = itemPrice;
		this.availableQuantity = availableQuantity;
	}


	public String getItemName() {
		return itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public Integer getAvailableQuantity() {
		return availableQuantity;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public void setAvailableQuantity(Integer availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
    
    

}