package service;

public interface VehicleService<T> {
    void add(T t);
    int findIndexById(int id);
    void update(T t,int id);
    void delete(int id);
    void print();
    void findById(int id);

}
