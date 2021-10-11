package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 7, 8, 5, 9};

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the element to be deleted: ");
        int delE = input.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delE) {
                index = i;
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
            }
        }
        System.out.println("The element to be deleted is in position " + (index + 1));
        System.out.println("Elements in array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");

        }
//        System.out.println(index);
    }

//    public static int delElement(int num ,int[] array){
//
//        return -1;
//    }

}
