package service;

public class MenuManager {
   public PersonManager personManager = new PersonManager();
    public void showMenu() {
        System.out.println("Menu");
        System.out.println("1. Thêm người vào danh sách");
        System.out.println("2. In danh sách");
        System.out.println("3. Xóa thành viên trong danh sách");
        System.out.println("4. Sửa thành viên trong danh sách");
        System.out.println("5. Tìm kiếm thành viên theo tên");
        System.out.println("6. Sắp xếp danh sách theo điểm trung bình");
        System.out.println("0. Kết thúc chương trình");
        System.out.println("Vui lòng lựa chọn: ");
    }

}
