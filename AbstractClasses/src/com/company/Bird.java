package com.company;

public abstract class Bird extends Animal implements ICanFly{

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking ");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    // Add another abstract method. So that's another abstarct class at this point. So that is an abstract class that
    // itself is extending from another abstract class. It's implementing the required methods that the Animal class required it to,
    // namely eat and breathe. But it's also defining an abstract method fly. That ultimately has to be overriden by another class as well.
    // Bird class is now abstract so it cannot be instantiated.
    // Note !!! : You can't directly instantiate a class that is abstract in anyway. So what we need to do is actually create
                    // another class. so to do that , we will change this, and we will actually create a Parrot class.


    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings ");
    }
}
