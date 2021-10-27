package service;

public interface PersonService<T> {
    void add (T t);
    int findIndexById(int id);
    void update(T t , int id);
    void delete(int id);
    void sort();
    void print();

}
