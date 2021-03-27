package com.example.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Collection framework also includes things like sets Maps, trees, and ques. So at the top level of the collections
        // framework is the collections class. Now this exposes static methods that you can operate on collections such as
        // the sort method that we have used previously but they also return collection objects such as list method. Now the interfaces in
        // the collection framework, what they do is they allow the framework to be extended. And they actually define methods for all the fundamentals
        // operations that really are required for the various collection types. Now one of the design goals of the collections framework was that there
        // should be good interoperability amongst various collections, so not just the ones included in the framework.
        // So the main componenets or the core elements of the collections framework are interfaces. Now these are the abstract, Types that
        // represent collections, including this list interface that we have already seen and we will be looking at the interface hierarchy of the collections framework
        // Now the Java JDK provides a range of polymorphic algorithms that work on collections objects.
        Theatre theatre = new Theatre("Olympian", 8, 12);
        //theatre.getSeats();
        // Now the method we use to create seat copy and populate it in all the elements
        // on theater.seats is called a shallow copy.
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        //Collections.reverse(seatCopy);
        // That is a good way of pseudo randomization of a list using the shuffle method
        // that is part of the collections framework.
        Collections.shuffle(seatCopy);
        System.out.println("Printing seatCopy");
        printList(seatCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatCopy);
        Theatre.Seat maxSeat = Collections.max(seatCopy);
        System.out.println(" Min Element in Collection is : " + minSeat.getSeatNumber());
        System.out.println(" Max Element in Collection is : " + maxSeat.getSeatNumber());

        // Collection class provides a swap method to swap two elements in a list.
        // So we pass the name of the list and the index position of the two elements
        // that we wanna swap. And what happens is the swap method swaps their position in a list.

        sortList(seatCopy);
        System.out.println("Printing sorted seatCopy");
        printList(seatCopy);


    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==============================================");
    }

    // Collection class provides a swap method to swap two elements in a list.
    // So we pass the name of the list and the index position of the two elements
    // that we wanna swap. And what happens is the swap method swaps their position in a list.

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i=0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }

    // Merge sort requires far more memory than a bubble sort.









}


