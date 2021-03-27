package com.example.test;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // In java an iterator is a component that enables you to iterate through
        // a collection of elements typically a collection of objects the java
        // iterator interface in the java.util package represents such an iterator
        // typically you will obtain an iterator from a java collection like a list
        // or a set

        // We can not modify an collection through the iteration

        // SOS java also has a special list iterator which is a slightly more
        // advanced iterator which can be used to iterate the elements of a list
        // in both directions meaning both backwards and forwards.
        // ListIterator() extends the normal Iterator interface you can use
        // the hasNext() and next(0 methopds.
        List<String> list = new ArrayList<>();
        list.add("Tomy");
        list.add("Oiko");
        list.add("Kanas");

        System.out.println("===");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("===");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("===");

        System.out.println("=================================");
        List<String> list3 = new ArrayList<>();
        list.add("Jane");
        list.add("Heidi");
        list.add("Hana");

        // An iterator that i can use to iterate the elemnts.
        Iterator<String> iterator = list3.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            // concurrent modification exceptions SOS
            // list.remove(list.size() - 1)
            // we can remove elements through the iteration if onnly we call iteratorremove(0 method
            iterator.remove();
            System.out.println(next);
        }
        System.out.println("=====================================");
        System.out.println(list.size());
        System.out.println("=====================================");
        System.out.println("\n");

        System.out.println("=================================");

        System.out.println("=================================");
        Set<String> set = new HashSet();
        set.add("Tom");
        set.add("Chris");
        set.add("Kostas");

        // iterator2 can be used to iterate() the elemnts store in this set
        Iterator<String> iterator2 = set.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
        System.out.println("=================================");

        System.out.println("=================================");
        // Finally it is possible to obtain an iterator from a map
        // but it works a little bit differently you can either obtain a
        // iterate that can iterate through the set of keys stored in the map
        // or you can have obtain an iterator that can iterate through the values stored in the MAP
        // or you can obtain an iterator that can be iterate through entries stored.
        // entry consist of a key and a value, so the key value pairs.
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        Iterator<String> keyIterator = map.keySet().iterator();
        Iterator<String> valueIterator = map.values().iterator();

        Iterator<Map.Entry<String, String>> entryIterator = map.entrySet().iterator();

    }
}
