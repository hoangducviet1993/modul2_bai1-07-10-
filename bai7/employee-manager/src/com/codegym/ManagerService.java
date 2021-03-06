package com.codegym;

public interface ManagerService<T> {
    void add(T t);

    void print();

    int findById(int id);

    void update(T t, int id);
        void sort();

    void deleteById(int id);


}
