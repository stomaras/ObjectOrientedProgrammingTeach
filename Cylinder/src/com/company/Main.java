package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Circle circle = new Circle(3);
        Cylinder cylinder = new Cylinder(3,5);
        System.out.println("Area of circle is " + circle.getArea());
        System.out.println("Volume of Cylinder is " + cylinder.getVolume());
    }
}
