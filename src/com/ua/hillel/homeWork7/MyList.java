package com.ua.hillel.homeWork7;

import java.util.Arrays;


public class MyList {

    String[] myList = new String[0];


    public String[] addArray(String[] myList, String[] value) {
        if (myList == null)
            return value;
        if (value == null)
            return myList;
        String[] myList1 = new String[myList.length + value.length];
        System.arraycopy(myList, 0, myList, 0, myList.length);
        System.arraycopy(value, 0, myList, myList.length, value.length);
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

    public boolean equals(String[] value) {
        if (value == null) {
            return false;
        }
        if (!(myList.length == (value.length))) {
            return false;

        }
        for (int i = 0; i < myList.length; i++) {
            if (!myList[i].equals(value[i])) ;
            return false;
        }
        return true;
    }


    public void clear() {
        myList = new String[0];

    }


    public int indexOf(String value) {
        if (value == null) {
            return -1;
        }
        for (int i = 0; i < myList.length; i++) {
            if (value.equals(myList[i])) {
                return i;
            }

        }
        return -1;
    }

    public int getSize() {

        return myList.length;
    }

    public String get(int value) {
        return myList[value];


    }


}



