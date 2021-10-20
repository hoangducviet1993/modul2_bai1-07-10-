package com.codegym;

import model.Student;
import model.Teacher;
import service.PersonManager;
import service.StudentManager;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        PersonManager personManager = new PersonManager();
        personManager.add(new Student("Hoàng Việt", 27, 3, 100));
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            menu();
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    inputStudent();

            }
        }
    }

    public static void menu() {
        System.out.println("Menu");
        System.out.println("1.Thêm học viên: ");
        System.out.println("2.Thêm giáo viên: ");
        System.out.println("3.Sủa thông tin học viên theo code: ");
        System.out.println("4.Xóa học viên theo code: ");
        System.out.println("5. Tìm kiếm học viên: ");
        System.out.println("6. Sắp xếp học viên theo điểm số: ");
        System.out.println("7. Tổng điểm học viên: ");
        System.out.println("8.In danh sach học viên: ");
        System.out.println("0.Exit");
        System.out.println("______________________________________");
        System.out.println();
        System.out.println("Enter choice: ");
    }

    public static void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm học viên: ");
        System.out.println("Nhập tên học viên: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học viên:  ");
        int age = scanner.nextInt();
        System.out.println("Nhập code học viên:  ");
        int code = scanner.nextInt();
        System.out.println("Nhập điểm học viên");
        double scores = scanner.nextDouble();
        PersonManager personManager =new PersonManager();
        personManager.add(new Student(name,age,code,scores));
        personManager.print();

    }

    public static void inputTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm giáo viên: ");
        System.out.println("Nhập tên giáo viên: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi giáo viên:  ");
        int age = scanner.nextInt();
        System.out.println("Nhập code giáo viên:  ");
        int code = scanner.nextInt();
        System.out.println("Nhập môn học giáo viên dạy: ");
        scanner.nextLine();
        String subject = scanner.nextLine();
        PersonManager personManager =new PersonManager();
        personManager.add(new Teacher(name,age,code,subject));
        personManager.print();

    }

}
