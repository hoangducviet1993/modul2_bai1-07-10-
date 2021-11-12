package service;

public interface PhoneService<T> {
    void add(T t);

    int findIndexByPhoneNumber(String phoneNumber);

    void edit(String phoneNumber, T t);

    void delete(String phoneNumber);

    void displayUserInformationByPhoneNumber(String phoneNumber);

    void print();

}
