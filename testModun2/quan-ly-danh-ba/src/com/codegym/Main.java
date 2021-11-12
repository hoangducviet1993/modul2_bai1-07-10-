package com.codegym;

import create.Validation;
import menu.ShowMenu;
import service.ContactsManage;

import java.util.Scanner;

public class Main {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        int choice = -1;
        while (choice != 0) {
//            PhoneManage phoneManage = PhoneManage.getPhoneManage();
            ShowMenu.showMenuContacts();
            System.out.println("Nhập lựa chọn: ");
            choice = Validation.choiceExceptionHandling();
            switch (choice) {
                case 1:
                    ContactsManage.getPhoneManage().print();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.exit(0);
            }
        }

    }
}
