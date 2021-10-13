package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Số lượng sản Phẩm");
        int amount = scanner.nextInt();
        Product[] listProduct = new Product[amount];
        input(listProduct);
        System.out.println("Danh Sách Sản Phẩm: ");
        output(listProduct);
        System.out.println("Tổng Giá Các Sản Phẩm: "+  calculatorTotalPrice(listProduct));
        System.out.println("Nhập Sản Phẩm Cần Tìm: ");
        scanner.nextLine();
        String name =scanner.nextLine();
        findProductByName(name,listProduct);
        System.out.println("Nhập Mã Sản Phẩm cần Sửa: ");
        String code =scanner.nextLine();
        setProductByCode(code,listProduct);


    }

    public static void input(Product[] listProduct) {
        for (int i = 0; i < listProduct.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập Thông Tin Sản phẩm: ");
            System.out.println("1.Mã Sản Phẩm: ");
            String code = scanner.nextLine();
            System.out.println("2.Nhập Tên Sản Phẩm: ");
            String name = scanner.nextLine();
            System.out.println("3.Nhập Loại Sản Phẩm: ");
            String type = scanner.nextLine();
            System.out.println("4.Nhập Giá Sản Phẩm: ");
            double price = scanner.nextDouble();
            System.out.println("5.Đơn Tiền (Mặc Định USD: ");
            Product product = new Product(code, name, type, price, "USD");
            listProduct[i] = product;
        }
    }

    public static void output(Product[] listProduct) {
        for (int i = 0; i < listProduct.length; i++) {
            System.out.println(listProduct[i]);
        }
    }

    public static double calculatorTotalPrice(Product[] listProduct) {
    double total =0;
        for (int i = 0; i < listProduct.length; i++) {
            total += listProduct[i].price;
        }
        return total;
    }
    public static void findProductByName(String name,Product[] listProduct){
        int index = 0;
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].name.equals(name)){
                System.out.println("Sản Phẩm Cần tìm: "+ listProduct[i]);
            index++;
            }
        }
        if (index==0)
            System.out.println("Sản Phẩm Hiện Không Có: ");
    }
    public static void setProductByCode(String code ,Product[] listProduct){
        for (int i = 0; i < listProduct.length; i++) {
            if (listProduct[i].code.equals(code)){
                Scanner scanner = new Scanner(System.in);
                System.out.println("Nhập Lại Tên Sản Phẩm: ");
                String name = scanner.nextLine();
                listProduct[i].setName(name);
                System.out.println("Nhập  Lại Loại Sản Phẩm: ");
                String type = scanner.nextLine();
                listProduct[i].setType(type);
                System.out.println("Nhập Lại Giá Sản Phẩm: ");
                double price = scanner.nextDouble();
                listProduct[i].setPrice(price);
                System.out.println("Sản Phẩm sau khi thay đổi: ");
                System.out.println(listProduct[i]);
            }

        }
    }

}
