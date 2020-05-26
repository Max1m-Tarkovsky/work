package com.ua.hillel.homeWork7;

import java.util.Arrays;


public class MyList {

    String[] myList = new String[0];


    public String[] addArray(String[] value1, String[] value) {
        if (value1 == null)
            return value;
        if (value == null)
            return value1;
        String[] myList1 = new String[value1.length - 1 + value.length - 1];
        System.arraycopy(value1, 0, value1, 0, value1.length - 1);
        System.arraycopy(value, 0, value1, value1.length - 1, value.length - 1);
        return myList1;
    }

    public boolean add(String value) {
        if (value == null) {
            return false;
        }

        myList = Arrays.copyOf(myList, myList.length + 1);
        myList[myList.length - 1] = value;
        return true;
    }

    public boolean delete(String value) {
        if (value == null) {
            return false;
        }

        for (int i = 0; i < myList.length; i++) {
            if (value.equals(myList[i])) {
                for (int j = i; j < myList.length - 1; j++) {
                    myList[j] = myList[j + 1];
                    myList = Arrays.copyOf(myList, myList.length - 1);
                }
                return true;
            }

        }

        return false;
    }

    public boolean contains(String value) {
        if (value == null) {
            return false;
        }
        for (int i = 0; i < myList.length; i++) {
            if (value.equals(myList[i])) {
                return true;
            }
        }


        return false;
    }

    public boolean isEquals(int i, int i1) {
        if (!myList[i].equals(myList[i1])) {
            return false;
        } else return true;

    }


    public boolean clear() {
        myList = new String[0];
        if (myList.length == 0) {
            return true;
        }
        return false;

    }


    public int indexOf(String value) {
        if (value == null) {
            return -1;
        }
        for (int i = 0; i < myList.length - 1; i++) {
            if (value.equals(myList[i])) {
                return i;
            }

        }
        return -1;
    }

    public int getSize() {

        return myList.length - 1;
    }

    public String get(int value) {
        return myList[value];


    }


}



