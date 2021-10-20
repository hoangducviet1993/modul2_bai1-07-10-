package com.codegym;

import model.Student;
import service.StudentManager;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.add(new Student("Hoàng Việt", 27, 3, 100));
        studentManager.add(new Student("Nguyễn Văn A", 21, 15, 85));
        studentManager.add(new Student( "Nguyễn Văn B", 19, 23, 55));
        studentManager.add(new Student("Nguyễn Văn C", 20, 9, 71));
        studentManager.add(new Student("Nguyễn Văn D", 22, 6, 63));
        System.out.println("Danh sách học viên: ");
        studentManager.print();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Thêm học viên: ");
            System.out.println("2.Sủa thông tin học viên theo code: ");
            System.out.println("3.Xóa học viên theo code: ");
            System.out.println("4. Tìm kiếm học viên: ");
            System.out.println("5. Sắp xếp học viên theo điểm số: ");
            System.out.println("6. Tổng điểm học viên: ");
            System.out.println("7.In danh sach học viên: ");
            System.out.println("0.Exit");
            System.out.println("______________________________________");
            System.out.println();
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
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
                    studentManager.add(new Student(name, age, code, scores));
                    System.out.println("Danh Sách học viên : ");
                    studentManager.print();
                    break;
                case 2:
                    System.out.println("Nhập code học viên  cần Sửa: ");
                    int codeChance = scanner.nextInt();
                    System.out.println("Nhập tên học viên ");
                    String nameNew = scanner.nextLine();
                    System.out.println("Nhập tuổi học viên:  ");
                    int ageNew = scanner.nextInt();
                    System.out.println("Nhập code học viên:  ");
                    int codeNew = scanner.nextInt();
                    System.out.println("Nhập điểm học viên");
                    double scoresNew = scanner.nextDouble();
                    studentManager.update(new Student(nameNew, ageNew, codeNew, scoresNew),codeChance);
                    System.out.println("Danh Sách học viên : ");
                    studentManager.print();
                    break;
                case 3:
                    System.out.println("Nhập code học viên cần xóa: ");
                    int codeDelete = scanner.nextInt();
                    studentManager.deleteByCode(codeDelete);
                    studentManager.print();
                    break;
                case 4:
                    System.out.println("Nhập code học viên cần tìm: ");
                    int codeFind = scanner.nextInt();
                    int index = studentManager.findIndexByCode(codeFind);
                    System.out.println("Học Viên vị trí: " + index);
                    System.out.println(studentManager.getListStudentScore().get(index));
                    break;
                case 5:
                    System.out.println("Học viên được sắp xếp theo mã: ");
                    studentManager.sort();
                    studentManager.print();
                    break;
                case 6:
                    System.out.print("Tổng diểm học viên : ");
                    System.out.println(studentManager.sumScore());
                    break;
                case 7:
                    System.out.println("Danh sách học viên: ");
                    studentManager.print();
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }

}


