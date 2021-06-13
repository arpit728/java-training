package com.acecademy.collection;

import java.util.HashMap;
import java.util.Map;

public class AnimalHashMapDemo {

    public static void main(String[] args) {
        Map<Animal, Boolean> canFly = new HashMap<>();

        canFly.put(new Animal("tiger"), false);
        canFly.put(new Animal("Parrot"), true);
        canFly.put(new Animal("Dog"), false);

        Animal a = new Animal("Dog");

        System.out.println(canFly.containsKey(a));

    }
}

class Animal implements Comparable<Animal> {

    private String name;


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Animal)) return false;
        if (this.hashCode() != obj.hashCode()) return false;
        Animal animal = (Animal) obj;
        return this.name.equals(animal.name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Animal a) {
        return this.name.compareTo(a.name);
    }
}
