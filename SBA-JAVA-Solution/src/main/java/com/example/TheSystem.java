package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public abstract class TheSystem {

    private HashMap<String, Item> itemCollection; // Provides the list of items in the system or the cart depending on
                                                    // which class initiates it

    TheSystem() {
        itemCollection = new HashMap<String, Item>();
        if (getClass().getSimpleName().equals("AppSystem")) {
            Scanner input = null;
            try {
                input = new Scanner(new File("resources/sample.txt"));
            } catch (FileNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            while (input.hasNext()) {
                String line = input.nextLine();
                String[] itemInfo = line.split("  ");
                Item newItem = new Item(itemInfo[0], itemInfo[1], Double.parseDouble(itemInfo[2]),
                        Integer.parseInt(itemInfo[3]));
                itemCollection.put(itemInfo[0], newItem);
            }
        }
    }

    public void setItemCollection(HashMap<String, Item> itemCollection) {
        this.itemCollection = itemCollection;
    }

    public HashMap<String, Item> getItemCollection() {
        return itemCollection;
    }

    public Boolean checkAvailability(Item item) {
        if (item.getQuantity() >= item.getAvailableQuantity()) {
            System.out.format("System is unable to add %s to the card. System only has %d %ss.\n", item.getItemName(),
                    item.getAvailableQuantity(), item.getItemName());
            return false;
        } else {
            return true;
        }

    }

    public Boolean add(Item item) {
        if (item == null) {
            return false;
        }else if (itemCollection.containsValue(item)) {
            item.setQuantity(item.getQuantity()+1);
            return true;
        }else if (!itemCollection.containsValue(item)) {
            itemCollection.put(item.getItemName(), item);
            return true;
        }else {
            return false;
        }
    }

    public Item remove(String itemName) {
        if (itemCollection.containsKey(itemName)){
            Item item = itemCollection.get(itemName);
            itemCollection.remove(itemName);
            return item;
        }else {
            return null;
        }
    }

    public abstract void display();
}
