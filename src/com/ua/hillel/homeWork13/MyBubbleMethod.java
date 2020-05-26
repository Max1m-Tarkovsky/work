package com.ua.hillel.homeWork13;


import java.util.Arrays;

public class MyBubbleMethod {
    public static void main(String[] args) {
        int[] arr = {27,12,35,3,1};
        int temp;
        boolean sort = false;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sort = false;
                    temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));
    }
}