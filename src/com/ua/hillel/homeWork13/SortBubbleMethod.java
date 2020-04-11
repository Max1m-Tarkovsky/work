package com.ua.hillel.homeWork13;

import java.util.Arrays;

public class SortBubbleMethod {


    public static void sort(int[] value) {
        boolean sorted = false;
        int temp = 0;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < value.length - 1; i++) {
                if (value[i] > value[i + 1]) {
                    sorted = false;
                    temp = value[i + 1];
                    value[i+1] = value[i];
                    value[i]= temp;
                }
            }

        }

    }


}




