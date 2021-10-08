package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the square");
        System.out.println("2. Draw the triangle bottom -left");
        System.out.println("3. Draw the triangle top -left");
        System.out.println("4. Draw the triangle top - right");
        System.out.println("5. Draw the triangle bottom - right");
        System.out.println("6. Draw the isosceles triangle -bottom");
        System.out.println("7. Draw the isosceles triangle -top");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the square");
                for (int i = 0; i < 6; i++) {
                    System.out.println("* * * * * *");
                }
                break;
            case 2:
                System.out.println("Draw the triangle bottom -left");
                for (int i = 6; i > 0; i--) {
                    for (int j = 0; j < 7 - i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 3:
                System.out.println("Draw the triangle top -left");
                for (int i = 0; i <7; i++) {
                    for (int j = 0; j < 6-i; j++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 4:
                System.out.println("Draw the triangle top -right");
                for (int i = 0; i <6; i++) {
                    for (int j = 0; j < 6-i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i+1; k++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 5:
                System.out.println("Draw the triangle bottom -right");
                for (int i = 6; i >0; i--) {
                    for (int j = 0; j < 6-i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i; k++) {
                        System.out.print("*");
                    }
                    System.out.print("\n");
                }
                break;
            case 6:
                System.out.println("Draw the isosceles triangle - bottom");
                for (int i = 6; i >0; i--) {
                    for (int j = 0; j < 6-i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i; k++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 7:
                System.out.println("Draw the isosceles triangle -top ");
                for (int i = 0; i <7; i++) {
                    for (int j = 0; j < 6-i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < i+1; k++) {
                        System.out.print("* ");
                    }
                    System.out.print("\n");
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}

