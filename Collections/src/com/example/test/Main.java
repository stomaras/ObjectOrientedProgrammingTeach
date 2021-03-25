package com.example.test;

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
        theatre.getSeats();
        if (theatre.reserveSeat("H11")) {
            System.out.println(" Please Pay ");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("H11")) {
            System.out.println(" Please Pay ");
        } else {
            System.out.println("Sorry, seat is taken");
        }



    }
}
