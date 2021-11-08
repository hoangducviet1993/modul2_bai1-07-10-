package menu;

import model.Account;
import service.manage.RoomManager;
import service.manage.UserManager;

import java.io.IOException;
import java.util.Scanner;

public class MenuRoom {

    public static void roomManage(String username) throws IOException {
        UserManager.getUserList();
        RoomManager.getRoomList();
        int choice = -1;
        while (choice != 0) {
            MenuManager.showRoomMenu();
            choice = Account.choiceExceptionHandling();
            switch (choice) {
                case 1:
                    RoomManager.displayListRoom();
                    break;
                case 2:
                    System.err.println("Chưa có chức năng này");
                    break;
                case 3:
                    System.err.println("Chưa có chức năng này");
                    break;
                case 4:
                    System.err.println("Chưa có chức năng này");
                    break;
                case 5:
                    RoomManager.add(RoomManager.createRoom());
                    break;
                case 6:
                    RoomManager.edit();
                    break;
                case 7:
                    RoomManager.displayReadyRoom();
                    break;
                case 8:
                    RoomManager.findInformationById();
                    break;
                case 9:
                        RoomManager.findInformationByPrice();
                    break;
                case 10:
                    Scanner scanner= new Scanner(System.in);
                    System.out.println("Nhập Id phòng cần xóa: ");
                    int id = scanner.nextInt();
                    RoomManager.delete(id);
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
