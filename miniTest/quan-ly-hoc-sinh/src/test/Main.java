package test;

import model.Student;
import model.Teacher;
import service.PersonManager;

public class Main {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
         personManager.add(new Student("Hoàng Việt",27,03,100));
         personManager.add(new Teacher("Nguyễn Văn A ",37,04,"Toán"));
        System.out.println("Danh sách: ");
        personManager.print();
    }
}
