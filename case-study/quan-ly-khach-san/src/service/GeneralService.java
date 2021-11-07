package service;

public interface GeneralService<T> {
    void add(T t);
    void edit(String username ,T t);
    void delete(String username );
    int findIndexByUserName(String username);
}
