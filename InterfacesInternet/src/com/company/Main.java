package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // All the methods in the interface are public abstract by default
        // Interfaces are full abstraction
        // Abstract classes are partial abstraction.
        // concrete methods are the methods in which we can have implementation
        // Abstraction in Java :
        // Abstraction is a process of hiding the implementation details and showing only functionality to the user.
        // another way is to show only important things to the user and  hides the internal details
        // for example sending messages, you just type the text and send the message. You do not know the internal processing.
        // about the message delivery. Abstraction lets you focus on what the object does instead of how it does it.
        // Ways to achieve Abstraction
        // There are two ways to achieve abstraction in java
        // Abstract class (0 to 100%)
        // Interface(100%)
        // For example a car in itself is a well-defined object, which is composed of several other smaller objects like a gearing system
        // , steering mechanism, engine, which are again have their own subsystems. But for humans car is a one single object,
        // which can be managed by the help of its subsystems, even if their inner details are unknown.
        // So if a developer provides a good abstraction , users won't be tempted to peek at the object's
        // internal mechanisms.
        // Abstraction means putting all the variables and methods in a class which are necessary.
        // Abstraction is the common thing.
        // example:
        // If somebody in your college tell you to fill application form, you will fill your details
        // like name, address, data of birth, which semester, percentage you have got etc.
        // if some doctor gives you an application to fill the details, you will fill the details like name, address, date of birth, blood group, height and weight.
        // See in the above example what is the common thing?

        // Age , name, address so you can create the class which consist of common thing that is called abstract class
        HR hr = new HR();
        hr.confidentialDetails(5000, "good");
    }
}
