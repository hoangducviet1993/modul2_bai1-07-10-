package service;

import java.io.IOException;
import java.text.ParseException;

public interface ReceiptService <T> {
    void add(T t) throws IOException, ParseException;
    void edit(String id, T t) throws ParseException, IOException;
    void delete(String id) throws IOException, ParseException;
    int findIndexById(String id);
    int findIndexByRoomId(int id);

    void displayAllReceipt();

}
