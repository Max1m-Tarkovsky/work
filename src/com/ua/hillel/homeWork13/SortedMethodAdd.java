package com.ua.hillel.homeWork13;

import java.util.Arrays;

public class SortedMethodAdd {


    public static void sortMethodAdd (int[] value) {

        for (int i = 0; i < value.length; i++) {
            int value1 = value[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value1 < value[j]) {
                    value[j + 1] = value[j];
                } else {
                    break;
                }

            }
            value[j + 1] = value1;

        }
        System.out.println("Sort array with help Add method :" + Arrays.toString(value));
    }
}
