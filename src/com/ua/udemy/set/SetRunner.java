package com.ua.udemy.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetRunner {
    public static void main(String[] args) {

        String[] cars = {"Mini", "Mercedes-Benz", "Audi", "VW", "Smart", "Toyota", "Porsche"};
        String[] otherCars = {"Audi", "Ford", "Gms", "Toyota"};

        Set<String> carSet = new LinkedHashSet<>(Arrays.asList(cars));

        Set<String> otherCarSet = new LinkedHashSet<>(Arrays.asList(otherCars));

        Set<String> uniqueCare = new LinkedHashSet<>(carSet);
        uniqueCare.addAll(otherCarSet);
        print(uniqueCare);


    }

    private static void print(Set<String> cars) {

        System.out.println(cars);
    }
}
