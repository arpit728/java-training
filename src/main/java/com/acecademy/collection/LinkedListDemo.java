package com.acecademy.collection;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> nums = new LinkedList<>();

        nums.removeFirst();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);

        System.out.println(nums);

        nums.removeFirst();

        System.out.println(nums);

        nums.addFirst(10);
        System.out.println(nums);
    }
}
