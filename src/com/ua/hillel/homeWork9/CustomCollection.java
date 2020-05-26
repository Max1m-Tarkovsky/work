package com.ua.hillel.homeWork9;

import java.util.Collection;
import java.util.Collections;

public interface CustomCollection {


    class CustomLink {

        public String value;
        public String[] value2;
        public Collection value3;
        public CustomLink next;
        public int indexValue;

        public CustomLink(String str) {
            this.value = str;

        }

        public CustomLink(String[] strArr) {
            this.value2 = strArr;

        }

        public CustomLink(Collection strColl) {
            this.value3 = strColl;

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

       public boolean addAll(String[] strArr) {

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

        boolean delete(String str) {

            first = first.next;

            return true;
        }

        boolean delete(int index) {


            CustomLink currentValue = first;
            CustomLink previousValue = first;
            while (currentValue.indexValue != index) {
                if (currentValue.next == null)
                    return false;
                else {
                    previousValue = currentValue;
                    currentValue = currentValue.next;
                }
            }
            if (currentValue == first)
                first = first.next;
            else
                previousValue.next = currentValue.next;

            return true;
        }


        String get(int index) {
            CustomLink currentValue = first;
            while (currentValue.indexValue != index) {
                if (currentValue.next == null)
                    return null;
                else
                    currentValue = currentValue.next;
            }

            return "" + currentValue;
        }

        boolean contains(String str) {

            CustomLink currentValue = first;
            while (currentValue.value != str) {
                if (currentValue.next == null)
                    return false;
                else
                    currentValue = currentValue.next;
            }
            return true;

        }

        boolean clear() {

            CustomLinkList linkedList = new CustomLinkList();

            return true;

        }

        int size() {

            CustomLink current = first;

            int i = 0;
            while (current.value != null)
                i++;
            current = current.next;

            {
                if (current.next == null)
                    return 0;

                else {
                    return i;
                }
            }

        }

        boolean trim() {

            return true;
        }

        boolean compare(Collection coll, Collection newColl) {
            if (coll == null || newColl == null){
                return false;
            }
                if (coll.size() != newColl.size()) {
                    return false;
                }
            if (!coll.equals(newColl)) {
                return false;

            } else return true;
        }

    }
}




