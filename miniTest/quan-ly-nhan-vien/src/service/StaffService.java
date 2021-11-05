package service;

public interface StaffService<T> {
    void add(T t);
    int findIndexById(int id);
    int findIndexByName(String name);
    void update(T t,int id);
    void delete(int id);
    void print();

}
