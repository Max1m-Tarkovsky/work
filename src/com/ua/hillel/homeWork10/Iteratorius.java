package com.ua.hillel.homeWork10;


import java.util.Iterator;
import java.util.NoSuchElementException;// обдумать розмер масиыа на вход

public class Iteratorius implements Iterator{

        private Integer [] array;
        private int index = 0;

        public Iteratorius(Integer [] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return index < array.length;
        }

        @Override
        public Integer next() {
            if(!hasNext())
                throw new NoSuchElementException();
            return array[index++];
        }
    }


