package com.company;

// Looking at animal you might actually argue that ana animal can breath and can eat. All these methods are really
// common to all animals. It makes sense to include them in the base abstract class.
// Interfaces have only static variables because non static variables require an instance and of course you can not
// instantiate an interface. Interfaces can not have constructors but abstract classes can.
// Now all methods over the interface are automatically public. Whereas the methods of an abstract class can have any visibility.
// private protected e.t.c
// Abstract classes can have implemented methods, whereas in an interface all methods need to be abstract.


public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
