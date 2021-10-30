package com.codegym;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
//        FileWriter fileWriter =new FileWriter("demo1");
//        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//        bufferedWriter.write("Rei Dog\n");
//        bufferedWriter.write("Rei Dog2\n");
//        bufferedWriter.write("Rei Dog3\n");
//        bufferedWriter.write("Rei Dog4\n");
//        bufferedWriter.close();
        FileReader fileReader = new FileReader("demo1");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        int sum = 0;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            sum += Integer.parseInt(line);

        }
        bufferedReader.close();
        System.out.println("Tổng: "+sum);
    }
}
