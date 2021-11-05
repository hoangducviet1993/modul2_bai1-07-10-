package service;

import model.Account;

import java.util.ArrayList;

public class AdminService implements GeneralService<Account>{
    private ArrayList<Account>  accountList;
    private int count = 0;
    @Override
    public void add(Account account) {
        count++;
        account.setId(count);
        accountList.add(account);
    }

    @Override
    public void edit(int id, Account account) {
        if (findIndexById(id) != -1) {
            accountList.set(findIndexById(id), account);
        } else {
            System.out.println("Không tồn tại tài khoản: ");
        }

    }

    @Override
    public void delete(int id) {
        if (findIndexById(id) != -1) {
            accountList.remove(findIndexById(id));
        } else {
//            System.out.println("Không có tài khoản cần xóa: ");
        }

    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
}
