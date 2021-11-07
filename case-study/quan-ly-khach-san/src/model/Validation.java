package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
    public static final String LOGIN_NAME_REGEX = "^[a-zA-Z0-9]{8,16}$";
    public static final String PASSWORD_REGEX = "^[a-zA-Z0-9]{8,16}$";
    public static final String PHONE_NUMBER_REGEX = "0[35789][0-9]{8}";
    public static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

    public Validation() {
    }
    public static boolean validate(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }

}
