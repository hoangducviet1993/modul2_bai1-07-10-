package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fan fan1 = new Fan();
        fan1.setOn(true);
        System.out.println("Enter speed: ");
        int speed = scanner.nextInt();
        fan1.setSpeed(speed);
        System.out.println("Enter Radius: ");
        double radius= scanner.nextDouble();
        fan1.setRadius(radius);
        scanner.nextLine();
        System.out.println("Enter Color: ");
        String color = scanner.nextLine();
        fan1.setColor(color);
        System.out.println(fan1.toSing());

    }
}
