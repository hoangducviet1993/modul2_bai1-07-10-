package com.codegym;

public class Boss extends Person {
 private double numberOfEmployees;

    public Boss(int id, String name, int age, double numberOfEmployees) {
        super(id, name, age);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Boss() {

    }

    public double getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(double numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "numberOfEmployees=" + numberOfEmployees +
                '}'
                + super.toString();
    }
}
