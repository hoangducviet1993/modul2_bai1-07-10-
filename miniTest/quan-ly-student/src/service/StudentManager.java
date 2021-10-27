package service;

import model.Person;
import model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager extends PersonManager {
    private ArrayList<Student> studentList;

    public StudentManager() {
        this.studentList = new ArrayList<>();
    }

    public static Student createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Thông Tin Sinh Viên: ");
        System.out.println("______________");
        System.out.println("Nhập tên Sinh Viên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi Sinh Viên: ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm Toán của Sinh Viên: ");
        double math = scanner.nextDouble();
        System.out.println("Nhập điểm Lý của Sinh Viên: ");
        double physics = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa của Sinh Viên:");
        double chemistry = scanner.nextDouble();
        return new Student(name, age, math, physics, chemistry);

    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public void sort() {
        studentList.sort((o1, o2) -> (int) (o1.getMediumScore() - o2.getMediumScore()));

    }
    public void findMaxAvgScore() {
        double max = studentList.get(0).getMediumScore();
        int index = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (max < studentList.get(i).getMediumScore()) {
                max = studentList.get(i).getMediumScore();
                index = i;
            }
        }
        System.out.println(studentList.get(index));

}
