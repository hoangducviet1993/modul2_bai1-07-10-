package model;

import java.util.TreeMap;

public class Account {
    private TreeMap<String, String> accountMap;

    public Account() {
        accountMap = new TreeMap<>();
    }

    public TreeMap<String, String> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(TreeMap<String, String> accountMap) {
        this.accountMap = accountMap;
    }

    public void register(String username, String password) {
        accountMap.put(username, password);
    }

    public boolean login(String username, String password) {
        if (accountMap.containsKey(username)) {
            if (accountMap.get(username) == password) {
                return true;
            }
        }
        return false;

    }

    public void deleteByUsername(String username) {
        if (accountMap.containsKey(username)) {
            accountMap.remove(username);
            System.out.println("đã xóa thành công " + username);
        } else System.out.println("không tồn tại người này: ");
    }
}