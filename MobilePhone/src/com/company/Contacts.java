package com.company;

import java.util.ArrayList;

public class Contacts {
    private String name;
    private int phone;

    private ArrayList<String> contacts = new ArrayList<String>();


    public Contacts(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public void addContact(String name) {
        contacts.add(name);
    }

    public void printContactList() {
        System.out.println("You have" + contacts.size() + "contacts in your list");
        for (int i=0; i<contacts.size(); i++) {
            System.out.println((i+1) + "." + contacts.get(i));
        }
    }

    public void modifyContactItem(int position, String newContact) {
        contacts.set(position,newContact);
        System.out.println("Contact Item" + (position+1) + "has been modified.");
    }

    public void removeContactItem(int position) {
        String theContact = contacts.get(position);
        contacts.remove(theContact);
        System.out.println("The contact item in " + (position+1) + " has been removed.");
    }

    public String findContactItem(String searchContact) {
        int position = contacts.indexOf(searchContact);
        if (position >= 0) {
            return contacts.get(position);
        }
        return null;
    }

}
