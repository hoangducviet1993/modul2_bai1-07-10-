package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size: ");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println("");
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if(array[j]<min){
                min = array[j];
                index = j+1;
            }
        }
        System.out.println("The largest property value in the list is " + min + " ,at position " + index);
    }
}
