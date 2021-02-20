package com.company;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    // we want to expose a public static method, so that we can create a new contact record
    // and this will be very useful when we are accessing the functions that are built into mobile phone
    // So instead of having to parse the parameter for the name and the phone number we can create a contect record
    // so we call constructor to create a new contact record.
    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);    }
}
