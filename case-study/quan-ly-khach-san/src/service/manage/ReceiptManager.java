package service.manage;

import model.Receipt;
import model.Validation;
import service.ReceiptService;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

public class ReceiptManager implements ReceiptService<Receipt> {
    private static ArrayList<Receipt> receiptList;

    private ReceiptManager() {
    }

    public static ArrayList<Receipt> getReceiptList() {
        if (receiptList == null) {
            receiptList = new ArrayList<>();
            receiptList.add(new Receipt("000001", 101, "Nguyễn văn A", "Hoàng Đức Việt", "07/11/2021", "10/11/2021"));
            receiptList.add(new Receipt("000002", 102, "Nguyễn văn B", "Hoàng Đức Việt", "07/11/2021", "10/11/2021"));
            receiptList.add(new Receipt("000003", 103, "Nguyễn văn C", "Hoàng Đức Việt", "07/11/2021", "10/11/2021"));

        }
        return receiptList;
    }


    @Override
    public void add(Receipt receipt) throws IOException, ParseException {
        receiptList.add(receipt);
        writeReceiptToFile();
    }

    @Override
    public void edit(String id, Receipt receipt) throws ParseException, IOException {
        delete(id);
        add(createReceipt());
    }

    @Override
    public void delete(String id) throws IOException, ParseException {
        receiptList.remove(findIndexById(id));
        writeReceiptToFile();
    }

    @Override
    public int findIndexByRoomId(int id) {
        for (int i = 0; i < receiptList.size(); i++) {
            if (receiptList.get(i).getRoomId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int findIndexById(String id) {
        for (int i = 0; i < receiptList.size(); i++) {
            if (receiptList.get(i).getReceiptId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void displayAllReceipt() {
        Collections.sort(receiptList);
        System.out.println();
//        System.out.println("______________________*** DANH SÁCH TOÀN BỘ HÓA ĐƠN ***_____________________");
//        System.out.printf("%-15s %-20s %-20s %-15s %-15s %-15s %n", "Số hóa đơn", "Khách hàng", "Nhân viên", "Ngày check-in", "Ngày check-out", "Tổng tiền");
        for (int i = 0; i < receiptList.size(); i++) {
            System.out.println(receiptList.get(i));
        }
        System.out.println("____________________________________________________________________________");
    }

    public Receipt createReceipt() throws ParseException, IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số hóa đơn: ");
        String receiptId = scanner.nextLine();
        ReceiptManager.getReceiptList();
        while (findIndexById(receiptId) != -1) {
            System.out.println("Số hóa đơn đã tồn tại, vui lòng nhập lại");
            receiptId = scanner.nextLine();
        }
        System.out.print("Nhập số phòng: ");
        int roomId = -1;
        while (findIndexByRoomId(roomId) == -1 || roomId < 0) {
            Scanner sc = new Scanner(System.in);
            try {
                roomId = sc.nextInt();
                if (findIndexByRoomId(roomId) == -1) {
                    System.err.println("Phòng không tồn tại. Vui lòng nhập lại.");
                }
                if (roomId < 0) {
                    System.err.println("Số phòng không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (InputMismatchException e) {
                System.err.println("Dữ liệu nhập vào không hợp lệ. Vui lòng nhập lại");
            }
        }
        System.out.print("Nhập tên khách hàng: ");
        String customerName = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        String staffName = scanner.nextLine();
        System.out.println("Nhập ngày check-in (định dạng dd/MM/yyyy): ");
        String checkInTime = scanner.nextLine();
        while (!Validation.validate(checkInTime, Validation.DATE_REGEX)) {
            System.out.println("Ngày không hợp lệ. Vui lòng nhập lại.");
            checkInTime = scanner.nextLine();
        }
        System.out.println("Nhập ngày check-out (định dạng dd/MM/yyyy): ");
        String checkOutTime = scanner.nextLine();
        while (!Validation.validate(checkOutTime, Validation.DATE_REGEX) || DateCalculator.dateCompare(checkInTime, checkOutTime) > 0) {
            if (!Validation.validate(checkOutTime, Validation.DATE_REGEX)) {
                System.err.println("Ngày không hợp lệ. Vui lòng nhập lại.");
            }
            if (DateCalculator.dateCompare(checkInTime, checkOutTime) > 0) {
                System.err.println("Ngày check-out phải sau ngày check-in!");
            }
            checkInTime = scanner.nextLine();
        }

        return new Receipt(receiptId, roomId, customerName, staffName, checkInTime, checkOutTime);
    }

    public void displayReceiptListByDay(String startDay, String endDay) throws ParseException {
        Collections.sort(receiptList);
        int sumTotal = 0;
        System.out.println();
        System.out.println("__________________*** DANH SÁCH HÓA ĐƠN TỪ NGÀY " + startDay + " ĐẾN NGÀY " + endDay + " ***_________________");
//        System.out.printf("%-15s %-20s %-20s %-15s %-15s %-15s %n", "Số hóa đơn", "Khách hàng", "Nhân viên", "Ngày check-in", "Ngày check-out", "Tổng tiền");
        for (int i = 0; i < receiptList.size(); i++) {
            Receipt receipt = receiptList.get(i);
            int startCompare = DateCalculator.dateCompare(receipt.getCheckOut(), startDay);
            int endCompare = DateCalculator.dateCompare(receipt.getCheckOut(), endDay);
            if (startCompare >= 0 && endCompare <= 0) {
                sumTotal += receipt.getTotalPrice();
                System.out.println(receipt);
            }
        }
        System.out.println("___________________________________________________________________________________________________");
        System.out.println("Tổng số tiền: " + sumTotal);
        System.out.println();
    }

    public static void writeReceiptToFile() throws IOException, ParseException {
        Collections.sort(receiptList);
        FileWriter fileWriter = new FileWriter("src/service/manage.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String str = "Số hóa đơn,Tên khách hàng,Tên nhân viên,Giờ check-in,Giờ check-out,Tổng số tiền";
        for (Receipt receipt : receiptList) {
            str += "\n";
            str += receipt.getReceiptId() + ",";
            str += receipt.getCustomerName() + ",";
            str += receipt.getStaffName() + ",";
            str += receipt.getCheckIn() + ",";
            str += receipt.getCheckOut() + ",";
            str += receipt.getTotalPrice();
        }
        bufferedWriter.write(str);
        bufferedWriter.close();
    }
}
