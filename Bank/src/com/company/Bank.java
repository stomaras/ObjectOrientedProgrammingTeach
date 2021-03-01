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
}
