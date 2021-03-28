package com.example.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Each element in the LinkedList is called the Node.
        // Each Node of the LinkedList contains two items:
        // 1) Content of the element
        // 2) Pointer/Address/Reference to the Next Node in the LinkedList.

        //Note:
        //1. Head of the LinkedList only contains the Address of the First element of the List.
        //2. The Last element of the LinkedList contains null in the pointer part of the node
        //   because it is the end of the List so it doesn’t point to anything
        //   as shown in the above diagram.
        //3. The diagram which is shown above represents a singly linked list.
        //   There is another complex type variation of LinkedList which is called doubly linked list,
        //   node of a doubly linked list contains three parts:
        //   1) Pointer to the previous node of the linked list
        //   2) content of the element
        //   3) pointer to the next node of the linked list.

        // Why do we need a Linked List?
        // You must be aware of the arrays which is also a linear data structure
        // but arrays have certain limitations such as:
        // 1) Size of the array is fixed which is decided when we create an array so it is hard to
        //    predict the number of elements in advance,
        //    if the declared size fall short then we cannot increase the size of an array and
        //    if we declare a large size array and do not need to store that many elements
        //    then it is a waste of memory.
        // 2) Array elements need contiguous memory locations to store their values.
        // 3) Inserting an element in an array is performance wise expensive as we have
        //    to shift several elements to make a space for the new element.
        //    Similarly deleting an element from the array is also a performance wise expensive operation
        //    because all the elements after the deleted element have to be shifted left.


        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Apple");
        linkedlist.add("Orange");
        linkedlist.add("Mango");

        System.out.println("*****************************");
        System.out.println("** For loop **");
        System.out.println("*****************************");
        for (int num = 0; num < linkedlist.size(); num++) {
            System.out.println(linkedlist.get(num));
        }
        System.out.println("*****************************");
        System.out.println("** Advanced for loop **");
        System.out.println("*****************************");
        for (String str : linkedlist) {
            System.out.println(str);
        }

        System.out.println("*****************************");
        System.out.println("Using Iterator");
        System.out.println("*****************************");
        Iterator i = linkedlist.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("*****************************");
        System.out.println("Add item in LinkedList");
        System.out.println("*****************************");
        linkedlist.add("Lemon");
        System.out.println(linkedlist);
        System.out.println("\n");

        System.out.println("*****************************");
        System.out.println("Add element at a specific index in linkedlist");
        linkedlist.add(4,"LemonHaze");
        System.out.println(linkedlist);
        System.out.println("*****************************");
        System.out.println("\n");

        System.out.println("*****************************");
        System.out.println("Add elements at beginning and end of linkedlist");
        linkedlist.addFirst("Banana");
        linkedlist.addLast("cherry");
        System.out.println(linkedlist);
        System.out.println("*****************************");
        System.out.println("\n");

        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("Removing the First Element and Last Element from the list");
        System.out.println("LinkedList Elements are:");
        for (String str: linkedlist){
            System.out.println(str);
        }
        Object firstElement = linkedlist.removeFirst();
        System.out.println("\nElement removed: " + firstElement);
        Object lastElement = linkedlist.removeLast();
        System.out.println("Element removed: " + lastElement);
        System.out.println("\nList Elements after Remove:");
        for (String str2: linkedlist) {
            System.out.println(str2);
        }
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("\n");

        System.out.println("*****************************");
        System.out.println("*****************************");
        LinkedList<String> programmingLanguages = new LinkedList<String>();

        programmingLanguages.add("C");
        programmingLanguages.add("Java");
        programmingLanguages.add("Cobol");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");
        programmingLanguages.add("JavaScript");

        System.out.println("LinkedList Elements: ");
        for (String str: programmingLanguages) {
            System.out.println(str);
        }
        // Removing all elemts from LinkedList
        // programmingLanguages.clear()
        Object e = programmingLanguages.remove(2);
        System.out.println("\nElement : " + e + " removed from the list\n");

        System.out.println("After removal:");
        for (String str2: programmingLanguages) {
            System.out.println(str2);
        }
        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("\n");

        System.out.println("*****************************");
        System.out.println("*****************************");
        System.out.println("Append all elements of a list to linkedlist java");
        LinkedList<String> list = new LinkedList<String>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("DD");
        System.out.println(list);
        List<String> newList = new ArrayList<String>();
        newList.addAll(list);
        System.out.println("After add all: " + newList);



    }
}
