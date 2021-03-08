package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // The idea is to use an interface to provide a common behavior that can be used by several
    // classes by having them all implement the same interface. So it's really a way to standardize the
    // way a particular set of classes is used.

    // Interface: is actual a commitment, a contract if you will, that the method's signatures and that
    // those varibales in the interface constants if you defined any will not change.

    // We are going to create an interface to define the behaviour of a telephone.

    // If we have to find an interface but the actual class implementation in this case desk phone is the
    // specific functionality for a certain type of telephone. So the interface is there at an abstract level
    // to tell you what methods are valid and have to be actually overridden in an actual class. So that is
    // why you can not actually instantiate it using the ITelephone interface, you have to actually use the
    // actual class that has overriden that functionality.
    ITelephone timsPhone;
    timsPhone = new DeskPhone(123456);
    timsPhone.powerOn();
    timsPhone.callPhone(123456);
    timsPhone.answer();
    }
}
