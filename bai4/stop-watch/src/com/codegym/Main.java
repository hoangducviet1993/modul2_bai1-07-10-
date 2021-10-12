package com.codegym;


public class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        int[] array = new int[10000000];
        for (int i = 0; i < array.length; i++) {
            array[i]=i;
        }
        System.out.println("Các phần tử trong mảng : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");

        stopWatch.stop();
        System.out.println("Thời gian thực thi thuật toán :" + stopWatch.getElapsedTime() + " milisecond");
    }
}
