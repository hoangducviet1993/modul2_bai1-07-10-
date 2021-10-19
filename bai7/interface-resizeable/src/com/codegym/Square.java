package com.codegym;

public class Square extends Rectangle implements Resizeable{
    public Square() {
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side,side, color, filled);
    }
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void resize(double percent) {
        setSide(getSide()+(getSide()*percent/100));
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

//public class Square extends Shape implements Resizeable,Colorable{
//    private double side = 1.0;
//
//
//    public Square() {
//    }
//
//    public Square(double side) {
//        this.side = side;
//    }
//
//    public Square(double side, String color, boolean filled) {
//        super(color, filled);
//        this.side = side;
//    }
//
//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(double side) {
//        this.side = side;
//    }
//
//
//    public double getArea() {
//        return side*side;
//    }
//
//    public double getPerimeter() {
//        return 4*side;
//    }
//    public void resize(double percent){
//        setSide(getSide()+(getSide()*percent/100));
//    }
//    @Override
//    public void howToColor(){
//        System.out.println("Color all four sides");
//    }
//    @Override
//    public String toString() {
//        return "A Square with side="
//                + getSide()
//                +" Area: "
//                + getArea()
//                + ", which is a subclass of "
//                + super.toString();
//    }


}
