package com.company;

import java.util.ArrayList;

public class Customer {
    // it has two fields , A String called name and an ArrayList that holds objects of type Double called transactions
    private String name;
    private ArrayList<Double> transactions;

    // A constructor that takes a String (name of customer) and a double (initial transaction).It initialises name and
    // instantiates transactions.


    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    // And three methods, they are (their functions are in their names):
    // getName(), getter for name
    // getTransactions(), getter for transactions
    // addTransaction(), has one parameter of type double(transaction) and does not return anything

    public String getName() {
        return this.name;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }

}
