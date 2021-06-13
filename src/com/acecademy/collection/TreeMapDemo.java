package com.acecademy.collection;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<String, String> map = new TreeMap<>();
        map.put("john", "mumbai");
        map.put("Alice", "Delhi");
        map.put("Bob", "Kolkata");

        System.out.println(map);


        TreeMap<Animal, Boolean> canFly = new TreeMap<>();

        canFly.put(new Animal("tiger"), false);
        canFly.put(new Animal("Parrot"), true);
        canFly.put(new Animal("Dog"), false);

        Animal a = new Animal("Dog");

        System.out.println(canFly.containsKey(a));
        System.out.println(canFly);
    }
}

