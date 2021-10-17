package com.codegym;

public class ColorableTest {
    public static void main(String[] args) {
        Shape [] shapes =new Shape[6];
        shapes[0] = new Circle();
        shapes[1] = new Circle(2.5);
        shapes[2] = new Rectangle();
        shapes[3] = new Rectangle(3,2);
        shapes[4] = new Square();
        shapes[5] = new Square(2);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Square) {
                ((Square) shape).howToColor();
            }

        }

    }
}
