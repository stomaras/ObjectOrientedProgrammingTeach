package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // All the methods in the interface are public abstract by default
        // Interfaces are full abstraction
        // Abstract classes are partial abstraction.
        // concrete methods are the methods in which we can have implementation
        HR hr = new HR();
        hr.confidentialDetails(5000, "good");
    }
}
