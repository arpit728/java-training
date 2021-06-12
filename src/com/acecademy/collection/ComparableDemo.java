package com.acecademy.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Mumbai");
        names.add("Delhi");
        names.add("Bangalore");
        names.add("Kolkata");
        names.add("Chennai");

        System.out.println(names);
        Collections.sort(names);

        System.out.println(names);

        List<Student> students = new ArrayList<>();

        students.add(new Student("John", "A", 60));
        students.add(new Student("John", "B", 20));
        students.add(new Student("Alice", "B", 20));
        students.add(new Student("John", "A", 30));
        students.add(new Student("Watson", "C", 10));

        Collections.sort(students);
        System.out.println(students);

//        Collections.sort(students);
    }
}
