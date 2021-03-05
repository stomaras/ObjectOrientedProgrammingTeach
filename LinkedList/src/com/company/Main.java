package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer customer = new Customer("Tim", 54.96);
        Customer anotherCustomer;
        // When we actually do this assigment , what we were doing internally, java was actually assigning the second customer class
        // to point to the first class. Saved the memory address. So when we use the setBalance() method on the second class
        // it actually updated the first class and that's all because of how memory is used and allocated within java.

        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());

        // This is not a big deal in terms of computer processing time when we are dealing with
        // a small array as we can see in the screen here. We have got three or four elements, but when we actually
        // start talking about an array containing thousands, perhaps millions of existing records or existing items
        // is coming in a lot slower to process.

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(4);
        intList.add(3);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        // We change the element in position one
        intList.add(1, 2);
        System.out.println("------------------------------------------------");
        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
