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
        // An Abstract class can extend only one parent class but it can implement multiple interfaces.

        // Use an Abstract class when...
        // 1. You want to share code among several closely related classes(Animal - with fields name, age...)
        // 2. You expect classes that extend your abstract class to have many common methods or fields or required access modifiers other than public(protected, private)
        // 3. You want to declare non static or non final fields(foe example name, age), this enables you to define methods that can access and modify tghe state of an object(getName, setName).

        // Interface
        // 1. An interface is just the declaration of methods of an Class, it's not the implementation.
        // 2. In an Interface, we define what kind of operation an object can perform. These operations are defined by the classes that implement the Interface.
        // 3. You cannot instantiate them, and they may contain a mix of methods declared with or without an implementation. All methods in interfaces are automatically public and abstract.
        // 4. An Interface can extend another interface.
        // 5. Interfaces are more flexible and can deal with a lot more stress on the design of your program than the implementation.
        // 6. By introducing interfaces into your program, you are really introduce points of variation at which you can plug in different implementations for that interface.
        //    An Interfaces primary purpose is abstraction, decoupling the "what" from the "how".

        // Use an Interface when...
        // 1. You expect that unrelated classes will implement your interface. For example, the interfaces Comparable and Cloneable are implemented by many unrelatyed classes.
        // 2. You want to specify the behavior of a particular data type, but you are not concerned about who implements its behavior.
        // 3. You want to separate different behavior.
        // 4. The Collections API is an excellent example, we have the List interface and implementations ArrayList and LinkedList( more on that later in this course)
        // 5. The JDBC API is another excellent example. It exist of almost only interfaces. The concrete implementations are provided as "JDBC drivers". This enables you
        //    to write all the JDBC code independent of the database (DB) vendor. You will learn more about JDBC later in the course.

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

        // We created various examples of abstract classes. Is a good time to bring up what is the difference between
        // using an abstract class and an interface, and how do you actually go about deciding which one to use.
        // We need to consider the relationships is a, has a. For example a dog is an animal and a bird is an animal.
        // so this make sense to inherit from an animal class rather than impolementing an actual animal interface.
        // A parrot is a bird , so can you inherit from a bird based class. But there is a problem : Birds are not
        // the only animals that can fly. Bats are extremely good at it, for example, and even dragonflies are. But bat is
        // not a bird. So what we do wrong here is by putting the fly method in the bird class. So a bird can fly and a bat can fly.
        // So better design would be to have create a can fly interface, which interface can both birds and bats can implement.

    }
}
