package menu;

import model.Account;
import service.manage.ReceiptManager;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class MenuReceipt {
    public static void receiptManager(String username) throws ParseException, IOException {
        Scanner scanner = new Scanner(System.in);
        ReceiptManager.getReceiptInstance();
        int choice =-1;
        while (choice !=0){
            MenuManager.showReceiptMenu();
            choice = Account.choiceExceptionHandling();
            switch (choice){
                case 1:
                    ReceiptManager.getReceiptInstance().displayReceiptListByDay();
                    break;
                case 2:
                    System.out.println("Nhập Hóa đơn cần sửa:");
                    String receiptId = scanner.nextLine();
                    ReceiptManager.getReceiptInstance().edit(receiptId,ReceiptManager.getReceiptInstance().createReceipt());
                    break;
                case 3:
                    System.out.println("Nhập Hóa đơn cần xóa:");
                    String id = scanner.nextLine();
                    ReceiptManager.getReceiptInstance().delete(id);
                    break;
                case 4:
                    ReceiptManager.getReceiptInstance().displayAllReceipt();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
