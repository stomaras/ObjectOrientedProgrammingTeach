package com.example.mypackage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // final fields are not actually constants, because they can be modified but only once, and any
        // modification must be performed before the class constructor finishes.
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        // So it's actually good idea to mark variables as final whenever you know that the value should not be changed
        // once the initial value has been set.

        // public static final double PI = 3.14159;
        // All the Math class methods are static as well and they are all available without requiring instance.
        // Any attempt to extend Math class will fail because it's been marked final.
        // Marked a class as final you prevent your class from being subclassed.
        System.out.println(Math.PI);

        // Cryptography is a very complex subject. And i strongly advise you to use an existing cryptography library, if you ever
        // really needed to encrypt password or anything else for that matter.
        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(0);
        password.letMeIn(674312);
    }
}
