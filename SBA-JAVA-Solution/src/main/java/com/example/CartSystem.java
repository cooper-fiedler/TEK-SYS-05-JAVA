package com.example;

public class CartSystem extends TheSystem {
    CartSystem() {
    }

    @Override
    public void display() {
        Double subTotal = 0.0;
        
        
        
        System.out.println("Cart:");
        System.out.format("%-20s %-20s %-10s %-10s %-10s\n","Name","Description","Price","Quantity","Sub Total");
        getItemCollection().forEach(
                (key, value)
                -> System.out.format("%-20s %-20s %-10.2f %-10d %-10.2f\n", value.getItemName(), value.getItemDesc(), value.getItemPrice(), value.getQuantity(), (value.getItemPrice() * value.getQuantity())));
        for (Item i : getItemCollection().values()) {
                subTotal += (i.getItemPrice() * i.getQuantity());
        }
        Double tax = subTotal * 0.05;
        Double total = tax + subTotal;
        System.out.format("%-20s %-20.2f\n", "Pre-tax Total", subTotal);
        System.out.format("%-20s %-20.2f\n", "Tax", tax);
        System.out.format("%-20s %-20.2f\n", "Total", total);
        
    }
}
