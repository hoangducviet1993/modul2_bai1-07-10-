package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Circle: ");
        Circle circle =new Circle();
        System.out.println(circle +"S ="+ circle.getArea()+"P= "+circle.getPerimeter());
        circle =new Circle(3.5,"blue");
        System.out.println(circle +"S ="+circle.getArea()+"P= "+circle.getPerimeter());
        System.out.println("Cylinder: ");
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder + "V=" + cylinder.getCylindricalVolume());
        cylinder = new Cylinder(4.3);
        System.out.println(cylinder + "V=" + cylinder.getCylindricalVolume());
        cylinder = new Cylinder(2.0,"yelow",3.5);
        System.out.println(cylinder + "V=" + cylinder.getCylindricalVolume());
    }
}
