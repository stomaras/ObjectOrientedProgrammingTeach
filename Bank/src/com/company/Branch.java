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

        for (int i = 0; i < this.customers.size(); i++) {
            if (findCustomer(customerName) == null){
                return false;
            }
        }
        Customer customer = new Customer(customerName);
        this.customers.add(customer);
        customer.addTransaction(initialTransaction);
        return true;
    }

    // addCustomerTransaction(), has two parameters of type String (name of customer),
    // double(transaction) and returns true if the customers transaction was added successfully or false otherwise

    public boolean addCustomerTransaction(String customerName, double transaction) {
        for (int i = 0; i < this.customers.size(); i++) {
            if (findCustomer(customerName) == null) {
                return false;
            }
        }
        Customer newCustomer = new Customer(customerName);
        newCustomer.addTransaction(transaction);
        return true;

    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerName)){
                Customer newCustomer = new Customer(customerName);
                return newCustomer;
            }
        }
        return null;
    }

}
