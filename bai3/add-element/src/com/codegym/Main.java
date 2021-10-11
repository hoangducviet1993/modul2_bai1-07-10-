package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {10, 4, 6, 7, 8, 0, 0, 0, 0, 0};
        showArray(array);
        System.out.println("Nhập số cần chèn: ");
        int x = input.nextInt();
        System.out.println("Nhập Vị trí cần chèn vào trong mảng: ");
        int index = input.nextInt();
        if (index <= -1 || index >= array.length-1) {
            System.out.println("Không thể chèn phần tử vào mảng: ");
        } else {
            for (int i = array.length-1; i > index; i--) {
                    array[i]= array[i-1];
            }
            array[index]= x;
        }
        showArray(array);
    }
    public static void showArray(int[] array){
        System.out.println("Các phần tử trong mảng : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
    }

}
