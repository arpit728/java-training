package com.acecademy.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {


    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<>((o1, o2) -> Integer.compare(o2, o1));

        nums.add(10);
        nums.add(5);
        nums.add(12);
        nums.add(2);

        System.out.println(nums);

        System.out.println(nums.floor(6));
        System.out.println(nums.ceiling(6));
        System.out.println(nums.first());


        TreeSet<Person> person = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if (p1.id == p2.id) return 1;
                return Integer.compare(p1.id, p2.id);
            }

        });

        person.add(new Person(1, "A"));
        person.add(new Person(2, "B"));
        person.add(new Person(2, "C"));

        System.out.println(person);
    }
}


class Person {

    int id;
    String name;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}