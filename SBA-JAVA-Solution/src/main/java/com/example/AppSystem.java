package com.example;

public class AppSystem extends TheSystem {
    AppSystem() {
    }

    @Override
    public void display() {
        System.out.println("AppSystem Inventory:");
        System.out.format("%-20s %-20s %-10s %-10s\n","Name","Description","Price","Available Quantity");
        getItemCollection().forEach(
                (key, value)
                -> System.out.format("%-20s %-20s %-10.2f %-10d\n", value.getItemName(), value.getItemDesc(), value.getItemPrice(), value.getAvailableQuantity()));
            
        
    }

    @Override      // this overwrites the parents class add method 
    public Boolean add(Item item) {
        if (item == null) {
            return false;
        } else if (getItemCollection().containsValue(item)) {
            System.out.format("%s is already in the App System", item.getItemName());
            return false;
            
        }else if (!getItemCollection().containsValue(item)) {
            getItemCollection().put(item.getItemName(), item);
            return true;
            
        }else {
            return false;
        }
    }

    public Item reduceAvailableQuantity(String item_name) {
    	    	
        if (getItemCollection().containsKey(item_name)) {
            getItemCollection().get(item_name).setAvailableQuantity(getItemCollection().get(item_name).getAvailableQuantity()-1);
            if (getItemCollection().get(item_name).getAvailableQuantity() == 0) {
            	getItemCollection().remove(item_name);
            	
            }
            return getItemCollection().get(item_name);
        }else {
            return null;
        }
    }
}
