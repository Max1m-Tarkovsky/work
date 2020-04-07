package com.ua.hillel.homeWork10;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Iteratori {


    public static void main(String[] args) {
        String[] masiveArray = new String[7];

        for (int i = 0; i < masiveArray.length; i++) {
            masiveArray[i] = String.valueOf(i + 1);
        }


        Iterator<String> iteratorArray = getIterator(masiveArray);

        while (iteratorArray.hasNext()) {
            System.out.print(iteratorArray.next() + " ");
        }

    }


    public static <E> Iterator<E> getIterator(E[] array) {
        Iterator<E> iteratios = new Iterator<E>() {
            public int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }


            @Override
            public E next() {
                if (hasNext()) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException(" No such element Exceptions ");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException(" It is not possible to remove an element from an array ");
            }
        };
        return iteratios;
    }
}

