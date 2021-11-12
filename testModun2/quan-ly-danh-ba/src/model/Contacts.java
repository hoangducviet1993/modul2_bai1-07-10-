package model;

public class Contacts {
    private String phoneNumber;
    private String group;
    private String name;
    private String gentle;
    private String address;
    private String birthDay;
    private String email;

    public Contacts() {
    }

    public Contacts(String phoneNumber, String group, String name, String gentle, String address, String birthDay, String email) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gentle = gentle;
        this.address = address;
        this.birthDay = birthDay;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGentle() {
        return gentle;
    }

    public void setGentle(String gentle) {
        this.gentle = gentle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "PhoneList{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", gentle='" + gentle + '\'' +
                ", address='" + address + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
