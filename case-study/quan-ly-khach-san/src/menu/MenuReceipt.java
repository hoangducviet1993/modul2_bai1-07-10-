package menu;

import model.Account;
import service.manage.ReceiptManager;

import java.text.ParseException;
import java.util.Scanner;

public class MenuReceipt {
    public static void receiptManager(String username) throws ParseException {
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
