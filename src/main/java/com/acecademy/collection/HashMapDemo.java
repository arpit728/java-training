package com.acecademy.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> nameAndCity = new HashMap<>();

        nameAndCity.put("A", "Mumbai");
        nameAndCity.put("B", "Delhi");
        nameAndCity.put("C", "Kolkata");
        nameAndCity.put("D", "Chennai");

        System.out.println(nameAndCity);

        System.out.println(nameAndCity.containsKey("A"));
        System.out.println(nameAndCity.containsKey("Z"));


        String para = "aabcafbbm";

        Map<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < para.length(); i++) {
            char c = para.charAt(i);
            freq.putIfAbsent(c, 0);
            freq.computeIfPresent(c, (k, v) -> v + 1);
        }

        Set<Character> characters = freq.keySet();
        System.out.println(characters);

        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Integer count : freq.values()) {
            System.out.println(count);
        }

        for (Character key : freq.keySet()) {
            System.out.println(key);
        }
    }
}
