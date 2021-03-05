package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        // We are gonna create a linked list of the places to visit, which is
        // the capital cities in Australia that we talked about in the previous video.
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);


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
            System.out.println("Now visiting" + i.next());
        }
        System.out.println("============================");
    }
}
