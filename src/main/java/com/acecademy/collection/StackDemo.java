package com.acecademy.collection;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(12);
        stack.push(18);
        stack.push(25);
        System.out.println(stack);
        stack.pop();
        stack.pop();
        System.out.println(stack);

        System.out.println(stack.get(1));
        stack.add(1, 100);
        System.out.println(stack);



    }
}
