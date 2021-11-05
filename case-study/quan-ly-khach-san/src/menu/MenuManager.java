package menu;

import java.util.Scanner;

public class MenuManager {

    public static void showMenu() {
        System.out.println("1: Đăng Nhập: ");
        System.out.println("2: Đăng Ký: ");
        System.out.println("3: Thoát: ");
    }

    public static void showMenuLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = scanner.nextLine();

    }
}
