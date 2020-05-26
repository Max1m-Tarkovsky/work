package com.ua.hillel.homeWork7;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        MyList myList3 = new MyList();
        String[] arr1 = {"ssd"};
        String[] arr2 = {"dds"};

        myList.add("Class");
        myList.add("Home");
        myList.add("floor");

        System.out.println(myList.indexOf("Home"));
        System.out.println(myList.delete("Home"));
        System.out.println(myList.contains("Class"));
        myList.add("Home");
        System.out.println(myList.equals(myList3));
        System.out.println(myList.get(1));
        System.out.println(myList.getSize());
        myList.clear();
        System.out.println(myList);
        System.out.println(Arrays.toString(myList.addArray(arr1, arr2)));
    }


}
