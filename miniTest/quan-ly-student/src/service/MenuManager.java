package service;

import java.util.Scanner;

public class MenuManager {
   public static PersonManager personManager = new PersonManager();
    public static void showMenu() {
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
   public void addObject(){
      int choice = -1;
      while (choice != 0) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("1. Thêm Sinh Viên: ");
         System.out.println("2. Thêm Oto: ");
         System.out.println("0. Thay dổi lựa chọn: ");
         choice = scanner.nextInt();
         switch (choice) {
            case 1:
               try {
                  personManager.add(StudentManager.createStudent());
               } catch (NumberFormatException e) {
                  e.printStackTrace();
               };
               break;
            case 2:
//               vehicleManager.add(CarManager.createCar());
               break;
            case 0:
               System.out.println("Nhập lựa chọn tiếp theo: ");

            default:
               System.out.println("Không có lựa chọn mời chọn lại: ");
         }
      }
   }
}
