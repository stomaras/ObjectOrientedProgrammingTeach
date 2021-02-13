package com.company;
import java.util.*;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should ultimately
        // have an array with 106,81,26,15,5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.Implement the following methods
        // getIntegers, printArray, and sortIntegers:
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // sortIntegers should sort the array and return a new array containing the sorted numbers.
        // You will have to figure out how to copy the array elements from the passed array into a new array
        // and sort them and return the new sorted array.
        int[] IntegerNum;
        IntegerNum = getIntegers(5);
        printArray(IntegerNum);
        int length = IntegerNum.length;
        sortedArray(IntegerNum,length);
        printArray(sortedArray(IntegerNum,length));

    }

    public static int[] getIntegers(int number) {

        int[] arrays = new int[number];
        System.out.println("Insert in the array " + number + " numbers");
        for (int i = 0; i<arrays.length; i++){
             arrays[i] = scanner.nextInt();
        }
        return arrays;
    }

    public static void printArray(int[] array){
        for (int i=0; i< array.length; i++){
            System.out.println("Value is :" + array[i]);
        }
    }

    public static int[] sortedArray(int[] array, int length){

        int temp = 0;
        for (int i=0; i< array.length; i++){
            for (int j = i + 1; j<array.length; j++){
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        System.out.println("Sorted array in descending order is: ");
        return array;
    }
}
