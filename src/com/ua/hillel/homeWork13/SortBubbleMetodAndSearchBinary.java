package com.ua.hillel.homeWork13;

import java.util.Arrays;

public class SortBubbleMetodAndSearchBinary {
    public static void main(String[] args) {
        int[] sortArrayBubble = {3, 1, 5, 4, 6, 2};

        boolean sortedArray = false;
        while (!sortedArray) {
            sortedArray = true;
            int temp = 0;
            for (int i = 0; i < sortArrayBubble.length - 1; i++) {
                if (sortArrayBubble[i] > sortArrayBubble[i + 1]) {
                    sortedArray = false;
                    temp = sortArrayBubble[i];
                    sortArrayBubble[i] = sortArrayBubble[i + 1];
                    sortArrayBubble[i + 1] = temp;

                }
            }

        }
        System.out.println("Sort array with help Bubble method : " + Arrays.toString(sortArrayBubble));
        System.out.println("Line Search method : " + BinarySearch(sortArrayBubble, 5));


    }

    public static int BinarySearch(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch)
                firstIndex = middleIndex + 1;
            else if (arr[middleIndex] > elementToSearch)
                lastIndex = middleIndex - 1;


        }
        return -1;
    }

}


