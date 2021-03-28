package com.example.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("LinkedList Iterator Example : ");
        LinkedList<String> countries = new LinkedList<String>();
        System.out.println("*******************************************");
        // Add elements to LinkedList
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number of countries : ");
        int num = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i <= num; i++) {
            String country = scanner.nextLine();
            countries.add(country);
        }
        System.out.println(countries);
        System.out.println("********************************************");
        System.out.println("\n");
        // Obtaining Iterator
        Iterator it = countries.iterator();
        ListIterator listIt = countries.listIterator();
        // Iterating the countries in forward direction
        System.out.println("Countries Elements:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\n");
        System.out.println("********************************************");
        System.out.println("Forward Iteration");
        while (listIt.hasNext())  {
            System.out.println(listIt.next());
        }

        System.out.println("\nBackward iteration:");
        while (listIt.hasPrevious()){
            System.out.println(listIt.previous());
        }
        System.out.println("***********************************************");
    }
}
