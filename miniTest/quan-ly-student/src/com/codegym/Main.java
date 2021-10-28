package com.codegym;

import model.Student;
//import static service.MenuManager.*;
import service.MenuManager;
import service.PersonManager;
import service.StudentManager;

import java.util.Scanner;

public class Main extends MenuManager {

    public static void main(String[] args) {
	// write your code here
//        PersonManager personManager = new PersonManager();
//        personManager.add(new Student("Việt",27, 10,9,8.5));
//        personManager.add(new Student("Nam",22, 5,4,5.5));
//        personManager.add(new Student("Hoàng",21, 6,7,6.5));
//        personManager.add(new Student("Nguyễn Văn A",28, 7,8,7.5));
//        personManager.print();
        while (true){
            int choice = -1;
            showMenu();
            Scanner scanner = new Scanner(System.in);
            try{
                choice = scanner.nextInt();
            }catch (NumberFormatException e){
                System.out.println("Nhập só cơ:");
            }
            switch (choice){
                case 1:
                    
            }
        }


    }
}
