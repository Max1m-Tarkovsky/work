package com.ua.hillel.homeWork13;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {
    int[] sortArrayBubble = {1, 2, 3, 4, 5, 6};


    @Test
    public void binarySearch() {
        assertEquals("Should be 3", 1, BinarySearch.binarySearch(sortArrayBubble,2));
    }
}