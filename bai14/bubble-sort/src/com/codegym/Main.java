package com.codegym;

import static com.codegym.BubbleSort.bubbleSort;
import static com.codegym.BubbleSort.list;

public class Main {

    public static void main(String[] args) {
	// write your code here
        bubbleSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
