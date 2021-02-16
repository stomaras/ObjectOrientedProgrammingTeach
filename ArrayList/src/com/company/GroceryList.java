package com.company;

import java.util.ArrayList;

public class GroceryList {
    // In ArrayList we hold objects
    // We put brackets in the end because the ArrayList is actually a class, so can have her own constructor
    // in this case is calling an empty constructor.
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery List ");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " +groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item" + (position+1) + " has been modified.");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        // contains method will return true if the element exist.
        // contains method will return false if the element does not exist.
        boolean exists = groceryList.contains(searchItem);
        // searches the array lists for you and it finds the item that you have
        // passed in this case searchItem and returns the index position of this item
        // in our array lists of that item.
        // returns -1 if list does not contain the element.
        int position = groceryList.indexOf(searchItem);
        if (position >= 0) {
            return groceryList.get(position);
        }

        return null;
    }







}
