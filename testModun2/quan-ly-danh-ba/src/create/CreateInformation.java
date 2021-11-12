package create;

import model.Phone;

import java.util.Scanner;

public class CreateInformation {
    public static final Scanner SCANNER = new Scanner(System.in);


    public static String createPhoneNumber() {
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber = SCANNER.nextLine();
        while (!(Validation.validate(phoneNumber, Validation.PHONE_NUMBER_REGEX))) {
            System.err.println("Số điện thoại không hợp lệ: ");
            phoneNumber = SCANNER.nextLine();
        }
        return phoneNumber;
    }

    public static String createName() {
        String fullName = SCANNER.nextLine();
        int indexOfChar = fullName.indexOf(',');
        while (!Validation.validate(fullName, Validation.FULL_NAME) || indexOfChar != -1) {
            System.err.println("Họ và tên chưa hợp lệ. Vui lòng nhập lại.");
            fullName = SCANNER.nextLine();
            indexOfChar = fullName.indexOf(',');
        }
        return fullName;
    }

    public static String createBirthDay() {
        System.out.print("Nhập ngày sinh (định dạng dd/MM/yyyy): ");
        String date = SCANNER.nextLine();
        while (!Validation.validate(date, Validation.DATE_REGEX)) {
            System.err.println("Ngày không hợp lệ.");
            date = SCANNER.nextLine();
        }
        return date;
    }

    public static String createEmail() {
        System.out.print("Nhập địa chỉ email: ");
        String email = SCANNER.nextLine();
        while (!(Validation.validate(email, Validation.EMAIL_REGEX))) {
            System.err.println("Email không hợp lệ: ");
            email = SCANNER.nextLine();
        }
        return email;
    }

    public static Phone createUser() {
        String phoneNumber = createPhoneNumber();
        System.out.print("Nhập nhóm:");
        String group = SCANNER.nextLine();
        System.out.print("Nhập họ và tên: ");
        String name = createName();
        System.out.print("Nhập giới tính:");
        String gentle = SCANNER.nextLine();
        System.out.print("Nhập địa chỉ: ");
        String address = SCANNER.nextLine();
        String birthday = createBirthDay();
        String email = createEmail();
        return new Phone(phoneNumber, group, name, gentle, address, birthday, email);
    }

}
