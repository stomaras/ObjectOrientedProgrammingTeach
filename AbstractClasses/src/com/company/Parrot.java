package com.company;

public class Parrot extends Bird{

    public Parrot(String name) {
        super(name);
    }

    // And all we need to do here, is because the other methods are already overiden in the Bird class,
    // we only really need to do one. fly in this case. If this type of bird had an alternative way to breathe and eat we
    // could overriden and the other methods.



}
