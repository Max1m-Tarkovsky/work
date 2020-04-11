package com.ua.hillel.homeWork13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortBubbleMethodTest {
    SortBubbleMethod sortBubbleMethod = new SortBubbleMethod();
    int[] arr = {5, 4, 3, 2, 1};

    @Test
    public void sortTest() {
        sortBubbleMethod.sort(arr);
        assertArrayEquals("After sort method most be sort array", new int[]{1, 2, 3, 4, 5}, arr);
    }
}