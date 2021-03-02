package com.company;

import java.util.ArrayList;

public class Bank {
    // it has two fields. A String called name and an ArrayList that holds objects of type Branch called branches
    private String name;
    private ArrayList<Branch> branches;

    // A constructor that takes a String(name of the bank). It initialises name and instantiates branches

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    // findBranch(), has one parameter of type String (name of the Branch) and returns a Branch. Returns the
    // Branch if it exists or null otherwise.

    private Branch findBranch(String nameBranch) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName() == nameBranch) {
                Branch branch = new Branch(nameBranch);
                return branch;
            }
        }
        return null;
    }

    // has one parameter of type String (name of branch) and returns a boolean. It returns true if the branch
    // was added successfully or false otherwise.
    public boolean addBranch(String branchName) {
        for (int i = 0; i < branches.size(); i++) {
            if (branches.get(i).getName() == branchName) {
                return false;
            }
        }
        Branch newBranch = new Branch(branchName);
        branches.add(newBranch);
        System.out.println("New branch added:" + newBranch.getName());
        return true;
    }

    // Has three parameters of type String(name of the branch) and returns a boolean. It returns true
    // if the branch was added successfully or false otherwise.
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = new Branch(branchName);
        ArrayList<Customer> customers = branch.getCustomers();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName() == customerName) {
                return false;
            }
        }
        Customer newCustomer = new Customer(customerName);
        customers.add(newCustomer);
        System.out.println("New customer added: " + newCustomer.getName());
        return true;
    }

    // Has three parameters of type String(name of the branch), String (name of the customer), double (transaction)
    // and returns a boolean. It returns true if the customers transaction was added successfully or false otherwise
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = new Branch(branchName);
        Customer customer = new Customer(customerName);
        ArrayList<Customer> customers = branch.getCustomers();
        ArrayList<Double> transactions = customer.getTransactions();
        for (int i = 0; i < customers.size(); i++) {
            if ((customers.get(i).getName() == customerName) && (transactions.get(i) == transaction)) {
                return false;
            }
        }
        customer.addTransaction(transaction);
        System.out.println("New transaction added Customer " +customer.getName()+ " with transaction: " +transaction);
        return true;
    }

    // listCustomer(), has two parameters of type String (name of the branch), boolean
    // (print transactions) and returns a boolean. Return true if the branch exists or false otherwise
    // . This method prints out a list of customers.
    /*
    public boolean listCustomers(String branchName, boolean printTransactions) {
        Branch newBranch = new Branch(branchName);

        ArrayList<Customer> customers = new ArrayList<Customer>();
        ArrayList<Double> transactions = new ArrayList<Double>();
        System.out.println("Customer details for branch : " );

        for (int i = 0; i <= branches.size(); i++) {
            if (branches.get(i).equals(newBranch)) {
                printTransactions = true;
                for (int j = 0; j < customers.size(); j++){
                    String name = customers.get(j).getName();
                    ArrayList<Double> customerTransaction = customers.get(j).getTransactions();
                    System.out.println("Customer:" +name);
                    for (int k = 0; k < customerTransaction.size(); k++) {

                        if (k == 0){
                            System.out.println("Transactions");
                        }
                        System.out.println(+ k +"Amount" + customerTransaction.get(k));
                    }

                }
                return printTransactions;
            }
        }
        printTransactions = false;
        return printTransactions;
    }
    */
     



}
