package service;

public interface ProductService<T> {
    int findIndexByID(int id);

    void add(T t);

    void update(T t, int id);

    void deleteById(int id);

    void print();

    void sortUp();
    void sortDown();
}
