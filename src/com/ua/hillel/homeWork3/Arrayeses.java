package com.ua.hillel.homeWork3;

import java.util.Arrays;

public class Arrayeses {

    public static void main(String[] args) {

        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int i = 0; i < 10; i++) {
            System.out.print("Arrays = " + array[i] + " , " );
        }
        System.out.println();

        int[] arraysMin = {6, 0, 9, 67, -33, 21, 146, -5};
        int minValue = arraysMin[0];
        for (int i = 0; i < arraysMin.length; i++) {
            if (minValue > arraysMin[i])
                minValue = arraysMin[i];

        }
        System.out.println("Min value array : " + minValue);

        int[] arraysMax = {-4, 36, 10, -52, 45, 11, 1, -6};
        int maxValue = arraysMax[0];
        for (int i = 0; i < arraysMax.length; i++) {
            if (maxValue < arraysMax[i])
                maxValue = arraysMax[i];
        }

        System.out.println("Max Value array : " + maxValue);


        int[] arrays = {6, 0, -9, 67, 33, 21, 146, -5};
        int minValue2 = arrays[0];
        int maxValue2 = arrays[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < arrays.length; i++) {
            if (minValue2 > arrays[i]) {
                minValue2 = arrays[i];
                indexMin = i;
            }
            if (maxValue2 < arrays[i]) {
                maxValue2 = arrays[i];
                indexMax = i;
            }
        }
        int temp = arrays[indexMin];
        arrays[indexMin] = arrays[indexMax];
        arrays[indexMax] = temp;
        System.out.println("Swap Array : " + Arrays.toString(arrays));


        int[] array1 = {13, 62, 18, 33, 74};
        int value = 0;
        for (int i = 0; i < array1.length; i++) {
            value += array1[i];
        }
        System.out.println("Arithmetic mean of the array = " + value / array1.length);



    }
}
