package model;

import menu.MenuManager;
import service.manage.UserManager;

import java.util.Scanner;

public class Account {
    public static void register() {
        UserManager.getUserList();
        UserManager.add(UserManager.createUse());
    }

    public static boolean login(String username,String password){
        int index = UserManager.findIndexByUserName(username);
        return UserManager.getUserList().get(index).getPassword().equals(password);
    }
    public static void deleteAccount (String username) {
        UserManager.delete(username);
    }
    public static void accountManage(String username) {
        int choice = -1;
        while (choice != 0) {
            MenuManager.showAccountMenu();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    UserManager.getUserInformation(username);
                    break;
                case 2:
                    UserManager.edit(username, UserManager.createUse());
                    break;
                case 3:
                    UserManager.delete(username);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
