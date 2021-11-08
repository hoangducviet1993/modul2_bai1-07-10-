package service.manage;

import model.User;
import model.Validation;
import service.GeneralService;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserManager {
    private static ArrayList<User> userList;

    private UserManager() {

    }

    public static ArrayList<User> getUserList() {
        if (userList == null){
            userList = new ArrayList<>();
            userList.add(new User("ducviet006","ducviet93", "Hoàng Đức Việt","0868999600","ducviet12vl@gmail.com"));
            userList.add(new User("ducviet007","ducviet88", "Việt Hoàng","0358389993","hoangviet12vl@gmail.com"));
        }
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public static User createUse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập UserName:");
        String username = scanner.nextLine();
        while (!(Validation.validate(username, Validation.LOGIN_NAME_REGEX))) {
            try {
                System.err.println("UserName không hợp lệ: ");
                username = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error!!!!");
            }
        }
        System.out.println("Nhập Password: ");
        String password = scanner.nextLine();
        while (!(Validation.validate(password, Validation.PASSWORD_REGEX))) {
            try {
                System.err.println("Password không hợp lệ: ");
                password = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error!!!!");
            }
        }
        System.out.println("Nhập Tên người dùng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập số Phone Number: ");
        String phoneNumber = scanner.nextLine();
        while (!(Validation.validate(phoneNumber, Validation.PHONE_NUMBER_REGEX))) {
            try {
                System.err.println("Phone Number không hợp lệ: ");
                phoneNumber = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error!!!!");
            }
        }
        System.out.println("Nhập Email:");
        String email = scanner.nextLine();
        while (!(Validation.validate(email, Validation.EMAIL_REGEX))) {
            try {
                System.err.println("Email không hợp lệ: ");
                email = scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error!!!!");
            }
        }
        return new User(username, password, name, phoneNumber, email);
    }
    public static void add(User user) {
        userList.add(user);
    }

    public static void edit(String username, User user) {
        if (findIndexByUserName(username) != -1) {
            userList.set(findIndexByUserName(username), user);
        } else {
            System.out.println("Không tồn tại tài khoản: ");
        }
    }
    public static void delete(String username) {
        if (findIndexByUserName(username) != -1) {
            userList.remove(findIndexByUserName(username));
        } else {
            System.out.println("Không có tài khoản cần xóa: ");
        }

    }
    public static int findIndexByUserName(String username) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getUsername().equals(username) ) {
                return i;
            }
        }
        return -1;
    }
    public static void getUserInformation(String username) {
        if (findIndexByUserName(username) != -1) {
//            System.out.println();
//            System.out.println("____________________________*** THÔNG TIN TÀI KHOẢN ***____________________________");
//            System.out.printf("%-20s %-20s %-25s %n", "Họ và tên", "Tuổi", "Số điện thoại", "Email");
//            System.out.println();
            System.out.println(userList.get(findIndexByUserName(username)));
            System.out.println("___________________________________________________________________________________");
            System.out.println();
        } else {
            System.err.println("Sai tên đăng nhập.");
        }
    }

}
