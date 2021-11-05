package model;

import java.util.TreeMap;

public class Account extends Admin{
    private TreeMap<String,String> accountMap;
    public Account(){
        accountMap = new TreeMap<>();
    }

    public TreeMap<String, String> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(TreeMap<String, String> accountMap) {
        this.accountMap = accountMap;
    }
    public  void register(String username, String password){
        boolean check = accountMap.containsKey(username);
        if (!check){
            accountMap.put(username,password);
        } else {
            System.out.println("Tên đăng nhập này đã có người sử dụng ,vui lòng thử lại tên khác");
        }

    }
    public boolean login(String username, String password){
        boolean check =accountMap.containsKey(username);
        if (check){
            if (accountMap.get(username)==password){
                System.out.println("Đăng nhập thành công: ");
                return true;
            }
            System.out.println("Sai mật khẩu: ");
            return false;
        }
        System.out.println("Tài khoản không tồn tại");
        return false;
    }

    public void deleteByUsername(String username) {
        if (accountMap.containsKey(username)) {
            accountMap.remove(username);
            System.out.println("Đã xóa thành công " + username);
        } else System.out.println("Tài khoản không tồn tại: ");
    }
//    private  String username;
//    private String password;
//
//    public Account() {
//    }
//
//
//    public Account(String name, int age, int phoneNumber, String email, String username, String password) {
//        super(name, age, phoneNumber, email);
//        this.username = username;
//        this.password = password;
//    }

}
