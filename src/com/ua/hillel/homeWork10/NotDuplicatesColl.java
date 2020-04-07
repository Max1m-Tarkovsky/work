package com.ua.hillel.homeWork10;

import java.util.*;

public class NotDuplicatesColl {
    public static void main(String[] args) {

        Collection<Object> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(3);
        arr.add(14);
        arr.add(8);

        System.out.println(arr);
        System.out.println(returnNotDuplicatesColl(arr));
    }

    public static Collection<Object> returnNotDuplicatesColl(Collection<Object> collection) {
        return new HashSet<>(collection);
    }
}
