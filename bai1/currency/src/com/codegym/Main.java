package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter USD: ");
        float usd = scanner.nextFloat();
        float curre = usd*23000;
        System.out.print("Currency VND: " + curre);

    }
}
