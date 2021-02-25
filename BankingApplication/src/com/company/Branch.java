package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return this.customers;
    }


    private Customer findCustomer(String name) {
        int position = this.customers.indexOf(name);
        if (position < 0) {
            return null;
        }
        Customer customer = this.customers.get(position);
        return customer;
    }


    public boolean newCustomer(String name, double transaction){
        if (findCustomer(name) == null) {
            Customer customer = new Customer(name, transaction);
            this.customers.add(customer);
            return true;
        }
        return false;
    }


    // In this case if the customer is actually on file then we update transaction
    public boolean addCustomerTransaction(String name, double transaction) {
        Customer existingCustomer = findCustomer(name);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(transaction);
            return true;
        }
        return false;
    }


}
