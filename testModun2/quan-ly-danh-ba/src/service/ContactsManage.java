package service;

import model.Contacts;

import java.util.ArrayList;

public class ContactsManage implements PhoneService<Contacts> {
    private static ArrayList<Contacts> phonesList;

    private ContactsManage() {
        phonesList = new ArrayList<>();

        phonesList.add(new Contacts("0868999600","Nhà riêng","Hoàng Đức Việt","Nam","Kiến Hưng-Hà Đông","10/04/1993","ducviet12vl@gmail.com"));
        phonesList.add(new Contacts("0358389993","Di động","Việt Hoàng","Nam","Kiến Hưng-Hà Đông-Hà Nội","10/04/1993","hoangviet12vl@gmail.com"));
       phonesList.add(new Contacts("0978483345","Nhà riêng","Ngáo","Nữ","Kiến Hưng-Hà Đông","09/04/1997","ngao@gmail.com"));
    }

    private static ContactsManage contactsManage;

    public static ContactsManage getPhoneManage() {
        if (contactsManage == null) contactsManage = new ContactsManage();
        return contactsManage;
    }

    public static void setPhoneManage(ContactsManage contactsManage) {
        ContactsManage.contactsManage = contactsManage;
    }

    public static ArrayList<Contacts> getPhonesList() {
        return phonesList;
    }

    public void setPhonesList(ArrayList<Contacts> phonesList) {
        ContactsManage.phonesList = phonesList;
    }

    @Override
    public void add(Contacts contacts) {
        phonesList.add(contacts);

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
    public void edit(String phoneNumber, Contacts contacts) {
        phonesList.set(findIndexByPhoneNumber(phoneNumber), contacts);
        System.out.println("Thông tin đã cập nhật");

    }

    @Override
    public void delete(String phoneNumber) {
        phonesList.remove(findIndexByPhoneNumber(phoneNumber));

    }

    @Override
    public void displayUserInformationByPhoneNumber(String phoneNumber) {
        if (contactsManage.findIndexByPhoneNumber(phoneNumber) != -1) {
            System.out.println(phonesList.get(contactsManage.findIndexByPhoneNumber(phoneNumber)));
        } else {
            System.err.println("Không có số điện thoại này trong danh bạ");
        }
    }

    @Override
    public void print() {
        for (Contacts contacts : phonesList) {
            System.out.println(contacts);
        }
    }
}
