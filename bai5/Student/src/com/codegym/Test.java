package com.codegym;

public class Test {

    public static void main(String[] args) {
	// write your code here
        Student student = new Student("Hoàng","C0821i1");
        System.out.println(student.toString());
        student.setName("Việt");
        student.setClasses("C0821");
        System.out.println(student.toString());
    }
}
