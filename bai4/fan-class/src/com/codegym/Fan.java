package com.codegym;

public class Fan {
    private int SLOW;
    private int MEDIUM;
    private int FAST;
    private boolean on;
    private double radius;
    private String color;
    private int speed;

    public Fan() {
        this.SLOW = 1;
        this.MEDIUM = 2;
        this.FAST = 3;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
        this.speed = SLOW;

    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public void setColor( String color){
        this.color= color;
    }
    public void setOn(boolean on) {
        this.on = on;
    }

    public int setSpeed(int number) {
        switch (number) {
            case 1:
                this.speed = SLOW;
                break;
            case 2:
                this.speed = MEDIUM;
                break;
            case 3:
                this.speed = FAST;
                break;
        }
        return speed;
    }
    public String toSing(){
        if (on){
            return "This fan :{ speed : " + speed + " ; color : " + color + " ;radius : " + radius + " .Fan is on }" ;
        }else {
            return "This fan :{ color : " + color + " ;radius : " + radius + " .Fan is off }" ;
        }
    }
}
