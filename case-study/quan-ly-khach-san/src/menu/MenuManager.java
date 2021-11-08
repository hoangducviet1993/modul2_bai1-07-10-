package menu;

import java.util.Scanner;

public class MenuManager {

    public static void showLoginMenu() {
        System.out.println("1: Đăng Nhập: ");
        System.out.println("2: Đăng Ký: ");
        System.out.println("0: Thoát! ");
    }

    public static void MenuLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên đăng nhập: ");
        String username = scanner.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = scanner.nextLine();
    }

    public static void showManageMenu() {
        System.out.println("1. Quản lý tài khoản: ");
        System.out.println("2. QUản lý phòng: ");
        System.out.println("3. QUản lý hóa đơn: ");
        System.out.println("0. Thoát! ");
    }

    public static void showAccountMenu() {
        System.out.println("1. Xem thông tin tài khoản: ");
        System.out.println("2. Sửa thông tin cá nhân: ");
        System.out.println("3. Xóa tài khoản: ");
        System.out.println("0. Thoát! ");
    }

    public static void showRoomMenu() {
        System.out.println("1. Hiển thị danh sách phòng: ");
        System.out.println("2. Check-in: ");
        System.out.println("3. Check-out và in hóa đơn: ");
        System.out.println("4. Dọn dẹp phòng: ");
        System.out.println("5. Thêm phòng: ");
        System.out.println("6. Sửa thông tin phòng:");
        System.out.println("7. Danh sách phòng còn trống: ");
        System.out.println("8. Tìm kiếm thông tin theo số phòng: ");
        System.out.println("9. Tìm phòng theo giá: ");
        System.out.println("10. Xóa Phòng: ");
        System.out.println("0. Thoát! ");
    }

    public static void showReceiptMenu() {
        System.out.println("1. In và tính hóa đơn theo khoảng thời gian: ");
        System.out.println("2. Sửa thông tin hóa đơn(Theo só hóa đơn):");
        System.out.println("3. Xóa hóa đơn: ");
        System.out.println("4. In danh sách hóa đơn: ");
        System.out.println("0. Thoát! ");
    }
}
