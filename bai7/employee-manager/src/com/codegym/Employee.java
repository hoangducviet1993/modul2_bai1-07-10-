package com.codegym;

public class Employee extends Person {
    private  double salary;

    public Employee(int id, String name, int age, double salary) {
        super(id, name, age);
        this.salary = salary;
    }

    public Employee() {

    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                '}'
                +super.toString();
    }
}
