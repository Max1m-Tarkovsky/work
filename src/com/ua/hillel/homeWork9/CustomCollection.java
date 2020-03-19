package com.ua.hillel.homeWork9;

import java.util.Collection;

public interface CustomCollection {


    class CustomLink {

        public String value;
        public String[] value2;
        public Collection value3;


        public CustomLink next;


        public CustomLink(String str) {
            this.value = str;

        }

        public CustomLink(String[] strArr) {
            this.value2 = strArr;

        }

        public CustomLink(Collection strColl) {
            this.value3 = strColl;

        }

        public void displayLink() {
            System.out.print(value);
        }
    }

    class CustomLinkList {

        private CustomLink first;

        public void LinkList() {
            first = null;
        }

        public boolean isEmpty() {
            return (first == null);
        }

        public boolean add(String str) {

            CustomLink newLink = new CustomLink(str);

            newLink.next = first;
            first = newLink;
            return true;
        }

        boolean addAll(String[] strArr) {

            CustomLink newLink1 = new CustomLink(strArr);
            newLink1.next = first;
            first = newLink1;

            return true;
        }

        boolean addAll(Collection strColl) {

            CustomLink newLink1 = new CustomLink(strColl);

            newLink1.next = first;
            first = newLink1;

            return true;
        }


    }


}


//boolean addAll(Collection strColl);

//  boolean delete (int index);

//boolean delete (String str);

//  String get(int index);

//    boolean contains(String str);

// boolean clear();

//int size();

//boolean trim();
//  boolean compate(Collection coll);


// на основе интерфейса - реализовать коллекцию на основе связного списка

//String[] value  = new String[0];

/*
    public MyList(String[] myList, String[] value) {
        if (myList == null)
            System.out.println(value);
        if (value == null)
            System.out.println(myList);

        String[] myList1 = new String[myList.length + value.length];
        System.arraycopy(myList, 0, myList, 0, myList.length);
        System.arraycopy(value, 0, myList, myList.length, value.length);
        System.out.println(myList1);

        this.myList = myList1;
    }*/
