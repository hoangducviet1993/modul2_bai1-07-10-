package menu;

import model.Account;
import service.manage.RoomManager;
import service.manage.UserManager;

public class MenuRoom {

    public static void roomManage(String username) {
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

                    break;
                case 3:
                    break;
                case 4:
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
                    RoomManager.delete();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
