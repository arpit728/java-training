package com.acecademy.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("arpit");
        names.add("john");
        names.add("john");
        names.add("Alice");
        names.add("Bob");

        System.out.println(names);
    }
}
