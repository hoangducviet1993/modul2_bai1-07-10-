package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("Phương trình có delta bằng: "+equation.getDiscriminant());
        if(equation.getDiscriminant()>0){
            System.out.println("Phương trình có 2  nghiệm là: "+ equation.getRoot1()+" và "+equation.getRoot2());
        } else if (equation.getDiscriminant()==0){
            System.out.println("Phương trình có 1 nghiệm là: "+equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}
