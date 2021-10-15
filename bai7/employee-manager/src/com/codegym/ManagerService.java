package com.codegym;

public interface ManagerService<T> {
    void add(T t);

    void print();

    T findById(int id);

    void update(T t, int id);
    void deleteById(T t);


}
