package com.acecademy.collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 34, 5));
        ArrayList<User> users = new ArrayList<>(Arrays.asList(new User("John")));

        User[] userArr = users.toArray(new User[0]);
        System.out.println(Arrays.toString(userArr));

    }



}

class User{
    String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User(String name) {
        this.name = name;
    }
}
