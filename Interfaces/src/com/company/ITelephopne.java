package com.company;

// in this case that we are going to be or that are gonna be used in this
// interface that a class that implements this interface needs to actually implement
//
public interface ITelephopne {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
