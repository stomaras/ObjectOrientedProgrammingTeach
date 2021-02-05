package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B","Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");
        // Composition is actually creating object within object. So you have a master object in this case thePC
        // is managing and looking after, and this is using composition to achieve that
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
       thePC.powerUp();
    }
}
