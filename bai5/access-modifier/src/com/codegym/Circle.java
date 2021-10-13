package com.codegym;

public class Circle {
    double radius =1.0;
    String color ="red";

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
    }
}
