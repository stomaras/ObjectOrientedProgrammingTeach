package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Main {
            public static void main(String[] args) {
                // We are gonna create a linked list of the places to visit, which is
                // the capital cities in Australia that we talked about in the previous video.
                LinkedList<String> placesToVisit = new LinkedList<String>();
                addInOrder(placesToVisit, "Sydney");
                addInOrder(placesToVisit, "Melbourne");
                addInOrder(placesToVisit, "Brisbane");
                addInOrder(placesToVisit, "Perth");
                addInOrder(placesToVisit, "Canberra");
                addInOrder(placesToVisit, "Adelaide");
                addInOrder(placesToVisit, "Darwin");
                printList(placesToVisit);

                addInOrder(placesToVisit, "Alice Springs");
                addInOrder(placesToVisit, "Darwin");
                printList(placesToVisit);
                visit(placesToVisit);
            }

            // What we are gonna do is just use this concept of an iterator
            // So an iterator is another way of accessing and going through all entries that are in a particular array,
            // or an arrayList, or a linkedList, etc.
            private static void printList(LinkedList<String> linkedList) {
                // .iterator() this method is actually part of the LinkedList so comes() with it automatically
                // we are doing the equivelant with a for loop with a different way.
                Iterator<String> i = linkedList.iterator();
                // What we are doing is we are saying while that entry, while an element that's in this linkedList is pointing
                // to something else, in other words, there's at least on more record to actually visit, while that is true,
                // we are actually gonna show the current record.
                // i.next() is equivelant with i++. We are actually saying i will put that i.next() which actually
                // gives you the current record but also then moves onto the next record as well.
                // hasNext is just to say is there another entry. but .next is actually moving to the next entry.
                // but it actually returning what the current value is before it moves on.
                while (i.hasNext()){
                    System.out.println("Now visiting " + i.next());
                }
                System.out.println("============================");
            }

            // Show the advantages of a LinkedList.
            // What i am gonna do is add the cities in alphabet order. Now alphabetically it may not be the best
            // way to visit the cities in a country the size of Australia. But really the important thing here is
            // we are gonna be imposing an order. Every time an entry is added to the LinkedList, we are gonna make
            // sure it's added in alphabetically order.We are gonna start of an empty list, that means that the first
            // item to be added is always gonna be added right from the start. But when it comes to add the second
            // item what we are gonna do is, we are gonna compare it to the first and then three things can actually
            // happen. :
            //              1) If it's the same as the first, in other words , if it's a duplicate, we don't
            //                 wanna visit the same city twice , so if that's the case we are gonna ignore
            //                 that entry and not actually accept it.
            //              2) If it sorts alphabetically before the first city, if that's the case,
            //                 we want to insert it before the current city.
            //              3) If it alphabetically is greater than the current city, if that's the case
            //                 , we wanna move it to the next city, and then we wanna repeat the process.

            private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
                ListIterator<String> stringListIterator = linkedList.listIterator();
                // that's not actually yet pointing to the first record. So you have to actually use a
                // stringListIterator.next() to go to the first record.
                // It's not a good idea to write a method that both returns a value and
                // changes the object that's called from. So we rturning a true or false
                // but we also modifying the link list that was parsed by it.
                while (stringListIterator.hasNext()) {
                    int comparison = stringListIterator.next().compareTo(newCity);
                    // 0 means that we actually matched
                    if (comparison == 0) {
                        //equal do not add
                        System.out.println(newCity + "is already included as a destination");
                        return false;
                    } else if(comparison > 0) {
                        // new City should appear before this one
                        // Brisbane -> Adelaide
                        stringListIterator.previous();
                        stringListIterator.add(newCity);
                        return true;
                    } else if (comparison < 0) {
                        // move on the next city
                    }
                }
                stringListIterator.add(newCity);
                return true;
            }

            private static void visit(LinkedList cities) {
                Scanner scanner = new Scanner(System.in);
                boolean quit = false;
                boolean goingForward = true;
                ListIterator<String> listIterator = cities.listIterator();

                if (cities.getFirst() == "") {
                    System.out.println("No cities in the iternary");
                    return;
                } else {
                    System.out.println("Now visiting " + listIterator.next());
                    printMenu();
                }

                while (!quit) {
                    int action = scanner.nextInt();
                    scanner.nextLine();
                    switch (action) {
                        case 0:
                            System.out.println("Holiday (Vacation) over");
                            quit = true;
                            break;
                        case 1:
                            if (!goingForward) {
                                if (listIterator.hasNext()) {
                                    listIterator.next();
                                }
                                goingForward = true;
                            }
                            if (listIterator.hasNext()) {
                                System.out.println("Now visiting " + listIterator.next());
                            } else {
                                System.out.println("Reached the end of the list");
                                goingForward = false;
                            }
                            break;
                        case 2:
                            if (goingForward) {
                                if (listIterator.hasPrevious()) {
                                    listIterator.previous();
                                }
                                goingForward = false;
                            }
                            if (listIterator.hasPrevious()) {
                                System.out.println("Now visiting " + listIterator.previous());
                            } else {
                                System.out.println("We are at the start of the list");
                                goingForward = true;
                            }
                            break;
                        case 3:
                            printMenu();
                            break;
                    }
                }
            }

            private static void printMenu() {
                System.out.println("Available actions: \npress ");
                System.out.println("0 - to quit\n" +
                        "1 - go to next city\n" +
                        "2 - go to previous city\n" +
                        "3 - print menu options");
            }

        }



