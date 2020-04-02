package com.ua.oldHillel;


import java.util.*;

import static java.lang.System.out;

public class ListandArray {

    public static void main(String[] args) {
        Dog dog = new Dog("Tim");
        List<Dog> list1 = new ArrayList<>();
        list1.add(dog);
        list1.add(new Dog("Rim"));
        list1.add(new Dog("Vim"));
        list1.add(new Dog("Fim"));
        list1.add(new Dog("Yim"));
        list1.add(new Dog("Wim"));
        list1.add(new Dog("Jim"));
        list1.add(new Dog("Kim"));
        list1.add(new Dog("Lim"));
        list1.add(new Dog("Pim"));


        List<Dog> list2 = new LinkedList<>();
        list2.add(new Dog("Klim"));
        list2.add(new Dog("Fim"));
        list2.add(new Dog("Yim"));
        list2.add(new Dog("Wim"));
        list2.add(new Dog("Jim"));
        list2.add(new Dog("Kim"));
        list2.add(new Dog("Lim"));
        list2.add(new Dog("Brim"));
        list2.add(new Dog("Ounm"));
        list2.add(new Dog("Loijm"));
        list2.add(new Dog("KKlm"));
        list2.add(new Dog("Aderf"));

        Collection<Dog> dogs = addDoubleColl(list1, list2);


        //Collections.reverseOrder();


        for (int i = 0; i < list1.size(); i++) {
            out.println(i + 1 + ". " + list1.get(i));
        }


    }

    public static Collection<Dog> addDoubleColl(List<Dog> list1, List<Dog> list2) {
        Set<String> nameSet = new HashSet<>();
        for (Dog dog : list1) {
            nameSet.add(dog.getName());
        }
        for (Dog dog1 : list2) {
            if (nameSet.contains(dog1.getName())) {
                list1.add(dog1);
            }

        }
        return list1;
    }

}


