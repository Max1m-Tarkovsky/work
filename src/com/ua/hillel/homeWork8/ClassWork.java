package com.ua.hillel.homeWork8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ClassWork {
    public static void main(String[] args) {


        List<Integer> list = new LinkedList<>();
        list.add(1000000);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(list.size() / 2, i);

        }
        long finish = System.currentTimeMillis();


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1000000);
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(arrayList.size() / 2, i);

        }
        long finish1 = System.currentTimeMillis();


        System.out.println("List =  " + (finish - start));
        System.out.println("arrayList = " + (finish1 - start1));

    }
}