package com.codegym;

class Counter2 {
    static int count = 0;

    /*se lay bo nho chi mot lan và giu lai gia tri cua no */
    /*ket qua thuc hien in ra 3 dong cac gia tri : 1,2,3 */
    Counter2() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();
    }
}