
// 1)
// Write a method called readIntegers() with a parameter called count that represents how many integers
// the user needs to enter

// 2)
// The method needs to read from the console until all the numbers are entered, and then return an array
// containing the numbers entered

// 3)
// Write a method findMin() with the array as a parameter. The method needs to return the minimum value in
// the array

// 4)
// In the main method read the count from the console and call the method
// readIntegers() with the count parameter.

// 5)
// Then call the findMin() method passing the array returned from the call to the readIntegers() method

// Finally print the minimum element in the array.

package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Read the count from the console: " );
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("The elements of new array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("" + array[i]);
        }
        int min = findMin(array);
        System.out.println("The minimum value of new array is: " + min);

    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter the numbers that you will need in the array");
        for (int i = 0; i< count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        int min = newArray[0];
        int temp;
        for (int i = 1; i < newArray.length; i++) {
            if (newArray[i] < min) {
                min = newArray[i];
            }
        }
        return min;
    }


}
