package create;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final String PHONE_NUMBER_REGEX = "0[35789][0-9]{8}";
    public static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
    public static final String DATE_REGEX = "^\\d{2}/\\d{2}/\\d{4}$";
    public static final String FULL_NAME = "^\\S[(.*?)\\D\\s]+\\S$";

    public Validation() {
    }

    public static boolean validate(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

    public static int choiceExceptionHandling() {
        int choice = -1;
        try {
            choice = SCANNER.nextInt();
        } catch (InputMismatchException exception) {
            System.err.println("Nhập số nguyên!");
        } finally {
            SCANNER.nextLine();
        }
        return choice;
    }
}
