package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();




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

    public void getSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    // reserve seat , it reserves a particular seat for our theater.
    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        // we are going through all the seats
        for (Seat seat: seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        // in case has been an invalid seat sentence method.
        if (requestedSeat == null) {
            System.out.println(" There is no seat " + seatNumber);
            return false;
        }

        return requestedSeat.reserve();
    }


    // Class Seat which has the ability to reserve or cancel a particular seat.
    private class Seat {
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





    }

}
