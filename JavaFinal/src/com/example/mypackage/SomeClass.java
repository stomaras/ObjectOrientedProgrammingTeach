package com.example.mypackage;

public class SomeClass {

    private static int classCounter = 0;
    private final int instanceNumber;
    private final String name;

    // because instanceNumber is marked final it's value cannot be changed any where else in the class, or
    // As an example when you reading a record from a database you might wanna store the class instances unique
    // databases key which would not be available until you read the record from the database.

    // Constant variable names should be in upper case. So why are constants declared a static final?
    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
