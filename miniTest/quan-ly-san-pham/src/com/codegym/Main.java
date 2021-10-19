package com.codegym;

import model.Product;
import service.ProductManager;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ProductManager productManager = new ProductManager();
        productManager.add(new Product(1,"Sản Phẩm 1",1000));
        productManager.add(new Product(2,"Sản Phẩm 3",1200));
        productManager.add(new Product(3,"Sản Phẩm 4",1440));
        productManager.add(new Product(4,"Sản Phẩm 2",1210));
        productManager.add(new Product(5,"Sản Phẩm 5",1090));
        System.out.println("Danh Sách Sản Phẩm : ");
       productManager.print();
        System.out.println("Sửa Thông tin: ");
        productManager.update(new Product(6, "Sản Phẩm 6",1355),2);
        productManager.print();
        System.out.println("Sắp xếp theo giá tăng dần");
        productManager.sortUp();
        productManager.print();
        System.out.println("Sắp xếp theo giá giảm dần");
        productManager.sortDown();
        productManager.print();
        System.out.println("Nhập Id Sản Phẩm xóa: ");
        productManager.deleteById(3);
        productManager.print();
    }
}
