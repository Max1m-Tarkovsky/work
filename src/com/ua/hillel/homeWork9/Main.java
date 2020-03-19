package com.ua.hillel.homeWork9;


import java.util.Collection;

public class Main {


    public static void main(String[] args) {

        CustomCollection.CustomLinkList LinkedList1 = new CustomCollection.CustomLinkList();
        LinkedList1.add("Photo");
        LinkedList1.add("Photo1");
        LinkedList1.add("Photo3");
        LinkedList1.delete("Photo");
        LinkedList1.addAll(new String[]{"Value", "Value2"});
       // LinkedList1.addAll((Collection) LinkedList1);
        LinkedList1.contains("Photo1");
        LinkedList1.delete(2);
        System.out.println(LinkedList1.size());
        System.out.println(LinkedList1);





        LinkedList1.clear();



    }
}
