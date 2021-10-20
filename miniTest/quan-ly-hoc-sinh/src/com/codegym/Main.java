package com.codegym;

import model.StudentScore;
import service.StudentManager;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StudentManager studentManager = new StudentManager();
        studentManager.add(new StudentScore("Hoàng Việt",27,3,100));
        studentManager.add(new StudentScore("Nguyễn Văn A",21,15,85));
        studentManager.add(new StudentScore("Nguyễn Văn B",19,23,55));
        studentManager.add(new StudentScore("Nguyễn Văn C",20,9,71));
        studentManager.add(new StudentScore("Nguyễn Văn D",22,6,63));
        System.out.println("Danh sách học viên: ");
        studentManager.print();
        System.out.println("Thêm học viên: ");
        studentManager.add(new StudentScore("Nguyễn Văn E",23,12,75));
        studentManager.print();
        System.out.println("Tim học viên: ");
        System.out.println(studentManager.findIndexByCode(3));
        System.out.println("Sửa thông tin sinh viên: ");
        studentManager.update(new StudentScore("Nguyễn Văn F",23,18,55),15);
        studentManager.print();
        System.out.println("Săp xếp học viên theo mã: ");
        studentManager.sort();
        studentManager.print();
        System.out.println("Tổng điểm học viên: ");
        System.out.println(studentManager.sumScore());

    }
}
