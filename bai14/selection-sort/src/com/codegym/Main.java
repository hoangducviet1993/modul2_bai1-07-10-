package com.codegym;

import static com.codegym.SelectionSort.selectionSort;
import static com.codegym.SelectionSort.list;

public class Main {

    public static void main(String[] args) {
	// write your code here
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]+" ");
        }
    }
}
