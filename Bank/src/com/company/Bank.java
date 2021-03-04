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
            Branch checkedBranch = this.branches.get(i);
            if (checkedBranch.getName().equals(nameBranch)) {
                return checkedBranch;
            }
        }

        return null;
    }

    // has one parameter of type String (name of branch) and returns a boolean. It returns true if the branch
    // was added successfully or false otherwise.
    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    // Has three parameters of type String(name of the branch) and returns a boolean. It returns true
    // if the branch was added successfully or false otherwise.
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    // Has three parameters of type String(name of the branch), String (name of the customer), double (transaction)
    // and returns a boolean. It returns true if the customers transaction was added successfully or false otherwise
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName,transaction);
        }
        return false;
    }

    // listCustomer(), has two parameters of type String (name of the branch), boolean
    // (print transactions) and returns a boolean. Return true if the branch exists or false otherwise
    // . This method prints out a list of customers.


    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer :" + branchCustomer.getName() + "[" + i + "]");
                if (showTransactions) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j+1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

}
