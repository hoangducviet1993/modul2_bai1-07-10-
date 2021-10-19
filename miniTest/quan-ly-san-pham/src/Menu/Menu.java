package Menu;

import model.Product;
import service.ProductManager;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.add(new Product(1, "Sản Phẩm 1", 1000));
        productManager.add(new Product(2, "Sản Phẩm 3", 1200));
        productManager.add(new Product(3, "Sản Phẩm 4", 1440));
        productManager.add(new Product(4, "Sản Phẩm 2", 1210));
        productManager.add(new Product(5, "Sản Phẩm 5", 1090));
        System.out.println("Danh Sách Sản Phẩm : ");
        productManager.print();
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1.Thêm sản phẩm: ");
            System.out.println("2.Sủa thông tin sản phẩm theo id: ");
            System.out.println("3.Xóa sản phẩm theo id: ");
            System.out.println("4. Tìm kiếm sản phẩm: ");
            System.out.println("5. Sắp xếp sản phẩm tăng dần: ");
            System.out.println("6. Sắp xếp sản phẩm giảm dần: ");
            System.out.println("0.Exit");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Thêm Sản Phẩm: ");
                    System.out.println("Nhập Id Sản Phẩm:  ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên Sản Phẩm ");
                    String name = scanner.nextLine();
                    System.out.println("Nhập giá Sản Phẩm");
                    double price =scanner.nextDouble();
                    productManager.add(new Product(id,name,price));
                    System.out.println("Danh Sách Sản Phẩm : ");
                    productManager.print();
                    break;
                case 2:
                    System.out.println("Nhập Id Sản Phẩm  cần Sửa: ");
                    int idBefore = scanner.nextInt();
                    System.out.println("Nhập Id Sản Phẩm:  ");
                    int id1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên Sản Phẩm ");
                    String name1 = scanner.nextLine();
                    System.out.println("Nhập giá Sản Phẩm");
                    double price1 =scanner.nextDouble();
                    productManager.update(new Product(id1,name1,price1),idBefore);
                    productManager.print();
                    break;
                case 3:
                    System.out.println("Nhập Id Sản Phẩm cần xóa: ");
                        int idDelete = scanner.nextInt();
                     productManager.deleteById(idDelete);
                     productManager.print();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }

}
