package com.codegym;

public class Square extends Rectangle {
    public Square(){
    }

    public Square(double side) {
        super(side, side);
    }
    public  Square(double side , String color, boolean filles){
        super(side, side, color, filles);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
