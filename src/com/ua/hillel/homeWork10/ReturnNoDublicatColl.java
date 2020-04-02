package com.ua.hillel.homeWork10;

import java.util.Collection;
import java.util.HashSet;

public class ReturnNoDublicatColl {

    public static Collection<Object> returnDuplicates (Collection<Object> collection) {
        return new HashSet<>(collection);
    }
}