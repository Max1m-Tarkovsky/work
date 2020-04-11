package com.ua.hillel.homeWork13;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortedMethodAddTest {
    SortedMethodAdd sortedMethodAdd = new SortedMethodAdd();
    int[] arr = {5, 4, 3, 2, 1};

    @Test
    public void sortMethodAdd() {
        sortedMethodAdd.sortMethodAdd(arr);
        assertArrayEquals("Most be sort array", new int[]{1, 2, 3, 4, 5},arr );
    }
}