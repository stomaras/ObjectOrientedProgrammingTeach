package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Abstraction is when you define the required functionality for something without actually
        // implementing the data house.
        // As i mention , interfaces are by definition, in Java, Abstract.
        // Abstract class vs Interface
        // 1. Type of methods : Interface can have only abstract methods. Abstract class can have abstarct and
              // non-abstract methods.
        // 2. Type of variables : Abstract class can have final, non-final, static and non-static variables.Interfaces
              // has only static and final variables.
        // 3. Type of variables: Abstract class can have final, non-final, static and non-static variables. Interface
              // has only static and final variables.
        // 4. Implementation: Abstract class can provide the implementation of interface. Interface can not provide
             // the implementation of abstract class.
        // 5. Inheritance vs Abstraction : A Java interface can be implemented using keyword " implements " and
             // abstract class can be extended using keyword "extends"
        // 6. Multiple implementation: An interface can extend another java interface only, an abstract class can
            // extend another java class and implement multiple Java interfaces.
        // 7. Accesibility of Data Members: Members of a java interface are public by default. A java abstract class can have
           // class members like private, protected, e.t.c, e.t.c.

        Dog dog = new Dog("Tomy");
        dog.breathe();
        dog.eat();
        System.out.println("#######################################################################");


        // NOTE !!!
        // Now birds can also fly, so it could be a good idea to add a fly method to our bird class. But not all birds can fly,
        // So implementing a fly method in the bird class is not a good idea. Better idea would be to create an abstract Bird class that extends Animal,
        // and also have an abstract fly method that individual Burd Objects can implement as they are able to.

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperror");
        penguin.fly();

    }
}
