package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Interface
    // Create a simple interface that allows an object to be saved to some sort of storage medium
    // Implement the following:



    // 1. ISaveable (interface)
    // it has two methods :
    // write(): takes no argument and returns a List containing object of type String.
    // read(): takes a List of type String and does not return anything.


    // 2. Player (class)
    // it has four fields. Two String s called name and weapon.Two int s called hitPoints and strength.
    // A constructor that accepts a String (name) and two int s (hitPoints and strength). It initialises name, hitPoints
    // and strength with the newly passed in values. It initialises weapon with the default weapon "Sword".
    // And eleven methods:
    //  Getters and setters for all four fields.
    //  write(), same as interface. Return a List of the fields in the order they appear in toString().
    //  read(), same as interface. Store the values in the List, in the order thehy appear in toString(). Make sure the
    // List is not null and the size() is greater than 0 before storing the values.
    // toString(), Player s overriding toString() method. It takes no arguments and returns a String in the following format:
    // Player{name='Tim', hitPoints=10, strength=15, weapon='sword'}


    // 3. Monster(class)
    // It has three fields. One String called name and Two int s called hitPoints and strength.
    // A constructor that accepts a String (name) and two int s ( hitPoints and strength). It initialises name, hitPoints and strength
    // with the newly passed in values.
    // And six methods:
    // Only getters for the three fields.
    // write(), same as interface. Return a List of the fields in the order they appear in toString().
    // read(), same as interface. Store the values in the List, in the order thay appear in toString().
    // Make sure the List() is not null and the size() is greater than 0 before storing the values.
    // toString(), Monsters overriding toString() method. It takes no arguments and returns a String in the following format:
    // Monster{name='Werewolf', hitPoints=20, strength=40}

    // There are obvious advantages to this ISaveable interface, in that we are guaranteeing what's a contract to confirm
    // that if a class is implementing this interface, it has to implement that code.
    //
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);
        tim.setHitPoints(8);
        System.out.println(tim);
        saveObject(tim);
        //loadObject(tim);
        System.out.println(tim);
        System.out.println("\n");
        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        // We actually casting this. What we do is , we say that this base class will use the ISaveable interface
        System.out.println("Strength is : " + ((Monster) werewolf).getStrength());
        System.out.println(werewolf);
        saveObject(werewolf);



    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }


    // .write() returns a list
    // this method can be used by any class that implements ISaveable Interface
    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i< objectToSave.write().size(); i++) {
            System.out.println(" Saving " + objectToSave.write().get(i) + " to storage device ");
        }
    }


    // save objects
    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }




}
