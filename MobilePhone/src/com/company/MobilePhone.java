package com.company;

import java.util.ArrayList;

public class MobilePhone {
    // has-a relationship with Contact class.
    private String myNumber;
    private ArrayList<Contact> contacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contact>();
    }

    // When adding or updating be sure to check if the contact already exists(use name).
    // that implies that we want to tell the process that's calling the methods whether
    // it successfully added or updated.
    // if is greater or equal to zero the contact is on file.
    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file.");
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        }

        this.contacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " replaced by" + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + " was not found. ");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    // Now we are going to implement two find contact methods.In other words we are going to
    // overload one of the methods. We are going to have one that returns the index position
    // and we will neeed that so we can actually edit that within the ArrayList.

    private int findContact(Contact contact) {
        return this.contacts.indexOf(contact);
    }


    private int findContact(String contactName) {
        for (int i = 0; i<this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i=0; i<contacts.size(); i++) {
            System.out.println((i+1) + "." +
                        this.contacts.get(i).getName() + "->" +
                        this.contacts.get(i).getPhoneNumber());
        }
    }



}
