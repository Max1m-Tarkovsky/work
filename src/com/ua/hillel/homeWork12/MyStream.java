package com.ua.hillel.homeWork12;


import java.util.*;
import java.util.stream.Collectors;


public class MyStream {
    public static void main(String[] args) {
        Collection<Integer> collection = Arrays.asList(3, 2, 4, 10, 6);
        OptionalDouble average12 = collection.stream().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).average();
        System.out.println(average12);


        Collection<ListOFPar> collection2 = new ArrayList<>();
        collection2.add(new ListOFPar("One", "One"));
        collection2.add(new ListOFPar("Two", "Two"));
        collection2.add(new ListOFPar("Tree", "Tree"));


        Map<String, String> upToCase = collection2.stream()
                .collect(Collectors.toMap(ListOFPar::getValue, t -> t.getValue2().toUpperCase()));
        System.out.println(upToCase);





        Collection<String> collection3 = Arrays.asList("home", "Task", "ignor", "Netflix", "tree");
        collection3.stream()
                .filter(x -> x.length() == 4)
                .filter(x -> x.equals(x.toLowerCase()))
                .forEach(System.out::println);


    }
}