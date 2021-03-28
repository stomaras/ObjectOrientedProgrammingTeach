package com.example.test;


// Vectors : is a type of List. So vector implements List
// and its is almost same as the ArrayList. Basic Vector is a dynamic array in
// which you can increase the size of a vector okay.
// Instead of using collection framework we can also use vectors
// Vector is the implementation of List and ArrayList is the implementation of List.
// Vector -> Dynamic Array
// Vector waste a lot of memory and ArrayList
// ArrayList increase the capacity by 50% vs Vector Increase the capacity by 100%
// Every method In vector is synchronized that means it's a thread safe right but not
// practically. Theoretically vectors are thread safe and others

import java.util.ArrayList;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
	// write your code here
         Vector<Integer> v = new Vector<Integer>(); // 100% // ThreadSafe // slow

        //ArrayList<Integer> v = new ArrayList<>() // 50% // No ThreadSafe // fast
        v.add(4);
        v.add(6);
        v.add(8);
        v.add(6);
        v.add(6);
        v.add(6);
        v.add(6);
        v.add(4);
        v.add(6);
        v.add(8);
        v.add(6);
        v.add(6);
        v.add(6);
        v.add(6);
        v.add(4);
        v.add(6);
        v.add(8);
        v.add(6);
        v.add(6);
        v.add(6);
        v.add(6);
        v.add(4);
        v.add(6);
        v.add(8);
        v.add(6);
        v.add(6);
        v.add(6);
        v.add(6);
        // if you exceed the size of 10 then makes capacity 20 automatically.
        // increases the capacitty as per user requirements so if you exceed the current limit
        // it will go to the double of it value limit. It will increase the capacity by 100%

        v.remove(1);
        System.out.println(v.capacity());

        for (int i : v) {
            System.out.println(i);
        }



    }
}
