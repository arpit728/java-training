package com.acecademy.collection;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("John");
        set.add("Alice");
        set.add("Bob");
        set.add("Watson");
        set.add("Sherlock");
        set.add("John");

        System.out.println(set);

        System.out.println(set.contains("John"));

        set.remove("John");
        System.out.println(set);
    }

}

