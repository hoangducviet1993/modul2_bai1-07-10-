package com.codegym;

import model.Dictionary;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Dictionary dictionary = new Dictionary();
        dictionary.print();
        dictionary.add();
        dictionary.print();
        dictionary.search();
    }

}
