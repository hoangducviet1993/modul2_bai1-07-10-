package service;

import model.Phone;

import java.util.ArrayList;

public class PhoneManage implements PhoneService<Phone> {
    private static ArrayList<Phone> phonesList;

    private PhoneManage() {
        phonesList = new ArrayList<>();
    }

    private static PhoneManage phoneManage;

    public static PhoneManage getPhoneManage() {
        if (phoneManage == null) phoneManage = new PhoneManage();
        return phoneManage;
    }

    public static void setPhoneManage(PhoneManage phoneManage) {
        PhoneManage.phoneManage = phoneManage;
    }

    public ArrayList<Phone> getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(ArrayList<Phone> phonesList) {
        PhoneManage.phonesList = phonesList;
    }

    @Override
    public void add(Phone phone) {
        phonesList.add(phone);

    }

    @Override
    public int findIndexByPhoneNumber(String phoneNumber) {
        for (int i = 0; i < phonesList.size(); i++) {
            if (phonesList.get(i).getPhoneNumber().equals(phoneNumber)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void edit(String phoneNumber, Phone phone) {
        phonesList.set(findIndexByPhoneNumber(phoneNumber), phone);
        System.out.println("Thông tin đã cập nhật");

    }

    @Override
    public void delete(String phoneNumber) {
        phonesList.remove(findIndexByPhoneNumber(phoneNumber));

    }

    @Override
    public void displayUserInformationByPhoneNumber(String phoneNumber) {
        if (phoneManage.findIndexByPhoneNumber(phoneNumber) != -1) {
            System.out.println(phonesList.get(phoneManage.findIndexByPhoneNumber(phoneNumber)));
        } else {
            System.err.println("Không có số điện thoại này trong danh bạ");
        }
    }

    @Override
    public void print() {
        for (Phone phone : phonesList) {
            System.out.println(phone);
        }
    }
}
