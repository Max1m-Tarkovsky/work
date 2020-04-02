package com.ua.hillel.homeWork12;


public class ListOFPar {
    private String value;
    private String value2;

    public String getValue() {
        return value;
    }

    public String getValue2() {
        return value2;
    }

    @Override
    public String toString() {
        return "ListOfPair :" + value + "  " + value2;

    }

    public ListOFPar(String value, String value2) {
        this.value = value;
        this.value2 = value2;
    }
}

