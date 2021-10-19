package com.codegym;

public class ResizeableTest {

    public static void main(String[] args) {
	// write your code here
        Circle circle= new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Shape[] shapes = {circle, rectangle, square};
        System.out.println("Before resize: ");

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println("After resize: ");
        for (Shape shape :shapes){
            double random = Math.random()*100;
            if (shape instanceof Circle){
                Resizeable resizeable =(Circle) shape;
                resizeable.resize(random);
            } if (shape instanceof Rectangle){
                Resizeable resizeable =(Rectangle) shape;
                resizeable.resize(random);
            } if (shape instanceof Square){
                Resizeable resizeable =(Square) shape;
                resizeable.resize(random);
            }
        }
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}
