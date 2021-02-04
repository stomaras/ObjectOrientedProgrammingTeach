package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // Start with a base class of vehicle, then create a Car class that inherits from this base class.
    // Finally, create another class, a specific type of car that inherits from the car class.
    // You should be able to hand steering, changing gears, and moving (speed in other words)
    // You will want to decide where to put the appropriate state and behaviour (fields and methods)
    // As mentioned above, changing gears, increasing/decreasing speed should be included.
    // For your specific type of vehicle you will want to add something specific for that type of car.

        Porsche porsche = new Porsche(36);
        porsche.accelerate(30);
    }
}
