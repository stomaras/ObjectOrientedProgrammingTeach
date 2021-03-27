package com.example.test;

import java.util.*;

public class Theatre {
    private final String theatreName;
    // We change format from an ArrayList to a LinkedList
    // But we can be even more generic than that, we can change List to a Collection
    // It is making it really generic by making it of type collection. So the advantages
    // of doing that is it enables us to use any of the collection classes to hold our seats.
    // Before we go and do that we can look at this interface hierarchy of the collections framework
    // and the java docs are pretty good here
    // An overview of the collection classes. So the interfaces set, List, Queue and Deque all extend
    // the collection interface. There is also SortedSet that extend set.
    // Collection interface extends : Set, List, Queue, Deque ( Interfaces ).
    // So when we declare seats to be of type collection. We can implement the list
    // of seats in a theater using any concrete class that implements one of the
    // interfaces that extend collection,
    // At the moment hopefully this should really demonstrate how array list and linked list
    // fit into the Collections framework, and that they can be replaced with other data structures
    // if that structure provides benefit for s particular task.
    // Set is a special kind of collection. SortedSet is a special kind od set
    public List<Seat> seats = new ArrayList<>();




    // The constructor takes a theater name together with the number of rows and the number of seats per row.
    // And it uses these to create seats which it currently stores as you can see in the array list on line 8
    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;

        // Theatre seats will be numered with a row letter and a seat number, I should say.
        int lastRow = 'A' + (numRows - 1);
        // Then what we are going to do is cycle through and create a seat for each one of these theater seats.
        for (char row = 'A'; row <= lastRow; row++) {
            // For each row we need to go through and allocate the seats for that section, So
            // in for loop we start with one , because obviously we can not have a seat to starting with zero.
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        int low = 0;
        int high = seats.size()-1;

        while (low <= high) {
            System.out.println(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    // reserve seat , it reserves a particular seat for our theater.
    /*
    public boolean reserveSeat(String seatNumber) {
        //Seat requestedSeat = null; fot comparison purposes
        // Binary Search is the fatest way to find an item in a sorted list.
        // and it works by checking the element in the mindpoint of the list.
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
            return false;
        }
        // we are going through all the seats

    }
    */



    // Class Seat which has the ability to reserve or cancel a particular seat.
    // implements Comparable and we are gonna compare on seat, of course, which is
    // the subject and what we need to do is add the comparable code so that,
    // Java knows how to compare two seats.
    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        // So i am gonna save in one to indicate whether this particular seat
        // has been reserved or not.
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                // because obviously there was a problem reserving it because it was
                // already reserved.
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + seatNumber + " cancelled ");
                return true;
            } else {
                // This seat is not reserved yet.
                return false;
            }
        }

        @Override
        public int compareTo(Seat seat) {
            // so that's gonna return the number less than zero, number equal with
            // zero if equals or greater than zero if it sis greater tha
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }

}


