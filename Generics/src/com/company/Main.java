package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Generics allow us to create classes in the faces of methods that take types of parameters called
        // unsurprisingly type parameters. We will start with an array list example that does not use generics
        // So we are gonna create an array list populated with integers and a method that prints the context of the array list doubled.
        // ArrayList as we have created it , can actually contain anything. Any type of object, not just an integer which we have basically done here.
        // This completely breaking the compiler checking.
        // Parameterized Type
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
        // this will actually get an exception. So what  actually happening is with the object which was a string tom
        // in this case, trying to be converted to an integer and it cannot be actually converted.
        // we will get an error because we are trying to add a different type of data to the array list.
        //items.add("tom");
        // The real problem is the program compiles fine, I can come here and build and rebuild a project and as far as java is concerned there are literally no
        // problems.
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (int i : n){
            // We cast the object as an integer.
            System.out.println(i * 2);
        }
    }
}
