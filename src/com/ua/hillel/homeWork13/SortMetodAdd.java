package com.ua.hillel.homeWork13;

import java.util.Arrays;

public class SortMetodAdd {
    public static void main(String[] args) {

        int[] arr = {1, 7, 4, 6, 8, 9, 5};
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < arr[j]) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }

            }
            arr[j + 1] = value;

        }
        System.out.println("Sort array with help Add method :" + Arrays.toString(arr));
    }
}



