package com.codegym;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import menu.LoginManager;
import menu.MenuManager;
import menu.MenuManager.*;
import model.Account;
import service.manage.ReceiptManager;
import service.manage.RoomManager;
import service.manage.UserManager;


public class Main {

    public static void main(String[] args) throws ParseException, IOException {
        RoomManager.getRoomList();
        RoomManager.readRoomFromFile();
        RoomManager.writeRoomToFile();

        ReceiptManager.getReceiptInstance();
        ReceiptManager.readReceiptFromFile();
        ReceiptManager.writeReceiptToFile();
        int choice = -1;
        while (choice != 0) {
            Scanner scanner = new Scanner(System.in);
            MenuManager.showLoginMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    LoginManager.loginToSystem();
                    break;
                case 2:
                    Account.register();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }

}
