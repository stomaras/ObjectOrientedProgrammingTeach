package com.company;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Generics keep the promise to allow the developer to be flexible without sacrificing the benefits of types
        // safety
        Container<Integer, String> container = new Container<>(12, "tom");
        int val1 = container.getItem1();
        String val2 = container.getItem2();
    }

    // Set do not store duplicates
    public static Set  union(Set set1, Set set2) {

    }
}
