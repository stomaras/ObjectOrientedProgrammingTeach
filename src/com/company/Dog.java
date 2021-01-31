package com.company;

public class Dog extends Animal {

    /* All the above are unique characteristics fields(states) unique to a dog */
    // fields (states) unique to a dog.
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
        // Automatically this 5 parameters that are dealing with the animal class name, brain
        // body, size, weight has been created as parameters to the Dog class
        // super means : is to call the constructor that is for the class that we are extending from
        // so this allow us to initialize the dog class . So dog is-a part of the Animal class
        // abd now we can add more features to this Dog class things that are unique to a dog and not just
        // a generic animal.
        // So now we work in Dog class , so we can add extra states(fields) and extra behaviours(methods) to the
        // Dog class.
    }

    // This is somthing unique to a dog
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    // Note every class that we create has extend from java.lang.Object
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
