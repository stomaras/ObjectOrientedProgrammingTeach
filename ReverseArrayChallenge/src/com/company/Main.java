package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here
        System.out.println("Read the count from the console: " );
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println("The elements of new array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("" + array[i]);
        }
        reverse(array,array.length);

    }

    public static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Enter the numbers that you will need in the array");
        for (int i = 0; i< count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }


    public static void reverse(int[] array, int n) {
        int[] b = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j-1] = array[i];
            j = j - 1;
        }

        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }

    }

}
