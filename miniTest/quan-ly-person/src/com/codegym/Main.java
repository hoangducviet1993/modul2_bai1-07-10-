package com.codegym;

import model.Student;
import model.Teacher;
import service.PersonManager;
import service.StudentManager;

import java.util.Scanner;

public class Main {
   public static PersonManager personManager = new PersonManager();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0){
            menu();
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    inputStudent();
                    break;
                case 2:
                    inputTeacher();
                    break;
                case 8:
                personManager.print();
                break;
                case 0:
                    System.exit(0);
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
        System.out.println("8.In danh sách học viên: ");
        System.out.println("0.Thoát");
        System.out.println("______________________________________");
        System.out.println();
        System.out.println("Nhập lựa chọn: ");
    }

    public static void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm học viên: ");
        System.out.println("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi học viên:  ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm học viên");
        double scores = scanner.nextDouble();
        personManager.add(new Student(name,age,scores));
        personManager.print();

    }

    public static void inputTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Thêm giáo viên: ");
        System.out.println("Nhập tên giáo viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi giáo viên:  ");
        int age = scanner.nextInt();
        System.out.println("Nhập môn học giáo viên dạy: ");
        scanner.nextLine();
        String subject = scanner.nextLine();
        personManager.add(new Teacher(name,age,subject));
        personManager.print();

    }

}
