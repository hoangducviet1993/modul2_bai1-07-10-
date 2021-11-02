package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String strTest = "Regex 15-05-2020, Nguyen Minh Duc 16/02/1998. Deadline 18_02_2020";
        Pattern patternDate = Pattern.compile("\\d{2}[-|/]\\d{2}[-|/]\\d{4}");
        Matcher matcher = patternDate.matcher(strTest);

        System.out.println("Ngày tháng năm trong chuỗi đầu vào: " + strTest +" là:");
        while(matcher.find()) {
            System.out.println(strTest.substring(matcher.start(), matcher.end()));
        }
        String strTest2 = "15/05/2020";
        String strTest3 = "16/02/mdse";
        patternDate = Pattern.compile("^\\d{2}[-|/][\\d]{2}[-|/]\\d{4}$");
        System.out.println("Chuỗi " + strTest2 + " có định dạng ngày tháng: "
                + patternDate.matcher(strTest2).matches());

        System.out.println("Chuỗi " + strTest3 + " có định dạng ngày tháng: "
                + patternDate.matcher(strTest3).matches());
    }
}
