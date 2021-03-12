package com.company;

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

    }
}
