package com.codegym;

public class TestCircle {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hình tròn 1: ");
    Circle circle1 = new Circle();
        System.out.println("Bán Kính bằng: "+ circle1.getRadius());
        System.out.println("Điện tích bằng: "+circle1.getArea());
        System.out.println("Hình tròn 2: ");
    Circle circle2 = new Circle(2.0);
        System.out.println("Bán Kính bằng: "+ circle2.getRadius());
        System.out.println("Điện tích bằng: "+circle2.getArea());

    }
}
