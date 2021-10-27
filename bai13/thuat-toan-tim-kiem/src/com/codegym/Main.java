package com.codegym;

import static com.codegym.BinarySearch.binarySearch;
import static com.codegym.BinarySearch.list;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(binarySearch(list, 2));  /* 0 */
        System.out.println(binarySearch(list, 11)); /* 4 */
        System.out.println(binarySearch(list, 79)); /*12 */
        System.out.println(binarySearch(list, 1));  /*-1 */
        System.out.println(binarySearch(list, 5));  /*-1 */
        System.out.println(binarySearch(list, 80)); /*-1 */
    }
}
