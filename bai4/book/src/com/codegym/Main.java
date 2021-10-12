package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Book[] listBook = new Book[2];
        input(listBook);
        output(listBook);
        System.out.println("Tổng tiền là: "+calculatorTotalPrice(listBook));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        String nameBook = scanner.nextLine();
        findBookByName(nameBook,listBook);
    }

    public static void input(Book[] listBook) {
        for (int i = 0; i < 2; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập Thông Tin Sách: ");
            System.out.println("Tên Sách: ");
            String name = scanner.nextLine();
            System.out.println("Loại Sách: ");
            String category = scanner.nextLine();
            System.out.println("Tác giả: ");
            String author = scanner.nextLine();
            System.out.println("Nhập giá: ");
            double price = scanner.nextDouble();
            System.out.println("Sô Lương: ");
            int amount = scanner.nextInt();
            Book book = new Book(name, price, amount, category, author);
            listBook[i] = book;
        }
    }

    public static void output(Book[] listBook) {
        for (int i = 0; i < 2; i++) {
            System.out.println(listBook[i]);
        }
    }

    public static double calculatorTotalPrice(Book[] listBook){
        double total = 0;
        for (int i = 0; i < listBook.length; i++) {
            total += listBook[i].price * listBook[i].amount;
        }
        return total;
    }
    public static void findBookByName(String name , Book[]listBook){
        for (int i = 0; i < listBook.length; i++) {
            if(listBook[i].name.equals(name)){
                System.out.println(listBook[i]);
            }
        }
    }
}
