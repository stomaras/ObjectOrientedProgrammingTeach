package com.company;

public class MobillePhone implements ITelephone{
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobillePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone Powered Up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.printf("Now ringing " + phoneNumber + " on mobile phone ");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.printf("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.printf("Melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
