package com.company;

public class Porsche extends Car{
    private int roadServiceMonths;

    public Porsche(int roadServiceMonths) {
        super("Carrera", "4wd", 4, 2, 6, false,1);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){

        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if(newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if(newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if(newVelocity>20 && newVelocity<=30){
            changeGear(3);
        } else {
            changeGear(4);
        }
    }
}
