package com.acecademy;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {

    private final int a;

    public Main(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        new Dog();
    }

}

class Animal {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Cleaning the resources");
    }
}

class Dog extends Animal {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cleaning Dog resources");
    }
}


class User {
    int id;
    String name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        User u1 = (User) obj;
        if (u1.hashCode() != this.hashCode()) return false;
        return this.id == u1.id;
    }
}