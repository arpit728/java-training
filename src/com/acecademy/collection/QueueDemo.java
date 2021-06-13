package com.acecademy.collection;

import java.util.*;

public class QueueDemo {


    public static void main(String[] args) {


        ArrayDeque<Integer> deq = new ArrayDeque<>();

        deq.push(5);
        deq.push(10);
        deq.push(12);
        deq.push(18);
        System.out.println(deq);
        deq.pop();
        System.out.println(deq);

    }
}

class Bike {

    int id;
    String name;
    int rank;


    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }

    public Bike(int id, String name, int rank) {
        this.id = id;
        this.name = name;
        this.rank = rank;
    }


}