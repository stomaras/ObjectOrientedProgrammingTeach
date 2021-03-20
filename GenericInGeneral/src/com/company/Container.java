package com.company;


// This class is full generic because it is based on whatever types is passed into the angle brackets
// So container is a generic class

public class Container<i1, i2> {

    i1 item1;
    i2 item2;

    public Container(i1 item1, i2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printItems() {
        System.out.println("Printing Contents of container : ");
        System.out.println("Item 1: " + item1);
        System.out.println("Item 2: " + item2);
    }

    public i1 getItem1() {
        return item1;
    }

    public i2 getItem2() {
        return item2;
    }

    public void setItem1(i1 item1) {
        this.item1 = item1;
    }

    public void setItem2(i2 item2) {
        this.item2 = item2;
    }
}
