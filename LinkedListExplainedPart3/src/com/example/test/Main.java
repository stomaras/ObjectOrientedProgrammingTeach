package com.example.test;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("*****************************************");
        System.out.println("Create a LinkedList");
        LinkedList<String> programmingLanguages = new LinkedList<String>();
        System.out.println("*****************************************");
        System.out.println("\n");

        System.out.println("*****************************************");
        System.out.println("Add elements to LinkedList");
        programmingLanguages.add("Cobol");
        programmingLanguages.add("Java");
        programmingLanguages.add("C++");
        programmingLanguages.add("C");
        programmingLanguages.add("C#");
        System.out.println("*****************************************");
        System.out.println("\n");

        System.out.println("*****************************************");
        System.out.println("Displaying elemts before replace : ");
        for (String str: programmingLanguages) {
            System.out.println(str);
        }
        System.out.println("*****************************************");
        System.out.println("\n");

        System.out.println("*****************************************");
        System.out.println("Replacing 1st element with new value");
        programmingLanguages.set(0, "Javascript");
        System.out.println("1st Element replaced");
        System.out.println("*****************************************");
        System.out.println("\n");

        System.out.println("*****************************************");
        System.out.println("Displaying Elements after replace ");
        for (String str2: programmingLanguages) {
            System.out.println(str2);
        }
        System.out.println("*****************************************");
        System.out.println("\n");

        System.out.println("*****************************************");
        System.out.println("Check whether the elemets exist or not");
        if (programmingLanguages.contains("Java")){
            System.out.println("Element Java is present in List ");
        } else {
            System.out.println("List does not have element Java");
        }
        System.out.println("*****************************************");
        System.out.println("\n");

        System.out.println("*****************************************");
        System.out.println("Clone a LinkedList into another List \n");
        LinkedList<String> newList = new LinkedList<String>();
        newList = (LinkedList)programmingLanguages.clone();
        System.out.println(" New List is : " + newList);
        System.out.println("*****************************************");
        System.out.println("\n");

        System.out.println("*****************************************");
        System.out.println("Last occurence of an element into a List \n");
        LinkedList<String> list = new LinkedList<String>();
        list.add("AA");
        list.add("BB");
        list.add("CC");
        list.add("AA");
        System.out.println("Last index of AA: " + list.lastIndexOf("AA"));
        System.out.println("*****************************************");
        System.out.println("\n");

        System.out.println("*****************************************");
        System.out.println("pop(), push() methods");
        LinkedList<String> names = new LinkedList<String>();
        names.add("Tom");
        names.add("John");
        names.add("Agathi");
        names.add("Chris");
        System.out.println(names);
        System.out.println("Pop element from names list and display it");
        System.out.println("ELement removed: " + names.pop());
        System.out.println("Display after pop operation: ");
        System.out.println("LinkedList after:" + names);
        System.out.println("Removed the head: " + names.poll());
        System.out.println(names);
        System.out.println("Removed last element: " + names.pollLast());
        System.out.println(names);
        // peek method does not remove
        LinkedList<String> elements = new LinkedList<String>();
        elements.add("el1");
        elements.add("el2");
        elements.add("el3");
        elements.add("el4");
        System.out.println("LinkedList before " +elements);
        System.out.println(elements.peek());
        System.out.println(elements.peekFirst());
        System.out.println(elements.peekLast());
        System.out.println("LinkedList after " +elements);



    }
}
