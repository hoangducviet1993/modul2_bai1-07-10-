package com.codegym;

public class Main {

    public static final int[][] array = new int[6][8];

    public static void main(String[] args) {
        int max = array[0][0];
        System.out.println("Elements in array: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print((array[i][j] = (int)(Math.random() * 100))  + "\t");
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("Elements maximum in array: " + max);
    }
}
