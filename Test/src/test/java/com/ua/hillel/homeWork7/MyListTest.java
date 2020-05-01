package com.ua.hillel.homeWork7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyListTest {

    private static MyList myList;


    @Before
    public void setUp() {

        myList = new MyList();
        myList.add("a");
        myList.add("b");
        myList.add("c");

    }

    @Test
    public void add() {
        assertEquals("Should be true ", true, myList.add("d"));
        assertEquals("Collection hav this element ",true,myList.contains("d"));
        assertEquals("collection increased ",3,myList.getSize());
    }

    @Test
    public void delete() {
        assertEquals("Should be true ", true, myList.delete("b"));
    }

    @Test
    public void contains() {
        assertEquals("Should be true ", true, myList.contains("a"));
    }

    @Test
    public void isEquals() {
        assertFalse("should be false ", myList.isEquals(0, 1));
    }

    @Test
    public void clear() {
       assertEquals("Should be true ",true,myList.clear());

    }

    @Test
    public void indexOf() {
        assertEquals("should be 1 ",1,myList.indexOf("b"));
    }

    @Test
    public void getSize() {
        assertEquals("should be 2 ",2,myList.getSize());
    }

    @Test
    public void get() {
        assertEquals("should be a ","a",myList.get(0));
    }
}