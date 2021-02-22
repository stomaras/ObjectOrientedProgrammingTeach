package com.company;

import java.util.ArrayList;

public class Main {


// This would be the class that the objects being created from that would be added to
// the arrayList. String is a class in its own right.
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue(){
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}



    public static void main(String[] args) {
	// write your code here
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        // We can't do that we have an error
        // Error is type argument cannot be of primitive type
        // this is an issue because a primitive type is not a class.
        //ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
        // Concept of autoboxing - and it turns out that Java supports some primitive types
        // by using a class, an object wrapper if you will

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        // Integer.valueOf(i) convert from in into Integer class

        // Autoboxing : when we are creating or converting an integer a base primitive type int
        // to an Integer, that's called auto boxing.
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i<=10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }


        // intArrayList.get(i).intValue() converts from the Integer class back into an int type
        // Unboxing is where we are taking it from the class or from the object wrapper and converting back
        // to a primitive type.
        for (int i = 0; i<=10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56; // at compile time it gets converted to that : Integer.valueOf(56)
        int myInt = myIntValue.intValue(); // myIntValue.intValue();

        // Autboxing
        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for (double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(Double.valueOf(dbl));
        }

        // Unboxing
        for (int i=0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(i + " --> " + value);
        }

        // Autoboxing and Unboxing is cool thing to know when you want to store primitive types in array lists
        // or pass them as parameters using objects




    }
}
