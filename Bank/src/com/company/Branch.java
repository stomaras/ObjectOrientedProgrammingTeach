package com.company;

import java.util.ArrayList;

public class Branch {

    // It has two fields. A String called name and an ArrayList that holds objects of type Customer called customers
    private String name;
    private ArrayList<Customer> customers ;

    // A constructor that takes a String (name of branch). It initialises name and instantiates customers
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    // And five methods , they are (their functions are in their names):
    // getName(), getter for name.
    // getCustomers(), getter for customers.
    // newCustomer(), has two parameters of type String(name of customer), double(initial transaction) and returns
    // a boolean.Returns true if the customer was added successfully or false otherwise.

    public String getName() {
        return this.name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {

        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialTransaction));
            return true;
        }

        return false;
    }

    // addCustomerTransaction(), has two parameters of type String (name of customer),
    // double(transaction) and returns true if the customers transaction was added successfully or false otherwise

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)){
                return checkedCustomer;
            }
        }
        return null;
    }


}
