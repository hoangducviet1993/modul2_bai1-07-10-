package com.codegym;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private  float ySpeed = 0.0f;


    public MovablePoint() {
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed =ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed =xSpeed;
        this.ySpeed =ySpeed;
    }
    public float[] getSpeed(){
        return new  float[]{this.xSpeed, this.ySpeed};
    }
    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}'
                + super.toString();

    }
    public MovablePoint move(){
        this.setXY(getX()+getXSpeed(),getY()+getYSpeed());
        return this;
    }
//    public MovablePoint move(){
//            this.setX(getX()+getXSpeed());
//            this.setY(getY()+getYSpeed());
//        return this;
//    }
}
