package com.codegym;

import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {

//        // Tạo một luồng đầu vào bằng cách đọc một file
//        InputStream in = new FileInputStream("C:\\Users\\vieth\\OneDrive\\Desktop\\baiThucHanh\\modul2_bai1-07-10-\\bai17\\demo-test\\src\\com\\codegym\\CodeGym.txt");
//
//        // Mảng để mỗi lần đọc các byte từ luồng thì tạm thời để lên đó
//        // Ta dùng mảng 10 byte
//
//        byte[] bytes = new byte[10];
//        int i = -1;
//
//        // Đọc các byte trong luồng và gán lên các phần tử của mảng.
//        // Giá trị i là số đọc được của 1 lần. (i sẽ <= 10).
//        // Khi không còn phần tử trong luồng i sẽ = -1
//        while ((i = in.read(bytes)) != -1) {
//            // Tạo String từ các byte đọc được
//            String s = new String(bytes, 0, i);
//            System.out.println(s);
//        }
//        in.close();

        // Tạo một luồng ký tự đầu ra với mục đích ghi thông tin vào file
        OutputStream os = new FileOutputStream("output.txt");

        // Tạo một mảng byte ,ta sẽ ghi các byte này vào file nói trên .
        byte[] bytes = new byte[] { 'C', 'o', 'd', 'e', 'G', 'y', 'm' };
        
        // Ghi lần lượt các ký tự vào luồng
        for (int i = 0; i < bytes.length; i++) {
            byte b = bytes[i];
            // Ghi ký tự vào luồng
            os.write(b);
        }
        // Đóng luồng đầu ra lại việc ghi xuống file hoàn tất.
        os.close();
    }
}