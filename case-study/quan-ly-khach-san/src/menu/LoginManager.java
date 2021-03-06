package menu;

import model.Account;
import model.User;
import service.manage.UserManager;

import java.io.IOException;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginManager {

    public static void loginToSystem() throws ParseException, IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhập tên đăng nhập: ");
    String username = scanner.nextLine();
    UserManager.getUserList();
    int index = UserManager.findIndexByUserName(username);
       while (index == - 1) {
           System.err.println("Tên tài khoản không tồn tại. Vui lòng nhập lại!");
           username = scanner.nextLine();
           index = UserManager.findIndexByUserName(username);
       }
           User user = UserManager.getUserList().get(index);
           System.out.print("Nhập mật khẩu: ");
           String password = scanner.nextLine();
           if (Account.login(username,password)){
               System.out.println("Đăng nhập thành công! ");
               int choice =-1;
               while (choice!=0){
                   MenuManager.showManageMenu();
                   choice = Account.choiceExceptionHandling();
                   switch (choice){
                       case 1:
                           Account.accountManage(username);
                           break;
                       case 2:
                            MenuRoom.roomManage(username);
                            break;
                       case 3:
                            MenuReceipt.receiptManager(username);
                           break;
                       case 0:
                           System.exit(0);
                   }
               }
           }else {
               System.err.println("Sai Password");
       }
  }
}
