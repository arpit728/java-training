package com.acecademy.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();

        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Kolkata");
        cities.add("Chennai");
        cities.add("Z");
        cities.add("BC");
        cities.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });

        System.out.println(cities);

    }

}

class StudentComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return Integer.compare(s2.length(), s1.length());
    }
}
