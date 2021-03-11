package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // We define an interface but the actual class implementation in this case desk
    // desk phone is the specific functionality for a certain type of telephone.
    // So the interface is there at an abstract level to tell you what methods are
    // valid and have to be actually overridden in an actual class.
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        System.out.println("\n");
        timsPhone.callPhone(123456);
        System.out.println("\n");
        timsPhone.answer();
        System.out.println("\n");
        System.out.println("\n");
        timsPhone = new MobillePhone(234567);
        timsPhone.powerOn();
        System.out.println("\n");
        timsPhone.callPhone(234567);
        System.out.println("\n");
        timsPhone.answer();


    }
}
