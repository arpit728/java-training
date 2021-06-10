package com.acecademy.stack;

public class StackArrayImpl implements Stack {

    private int stack[];
    private int top;
    private int cap;

    public StackArrayImpl(int cap) {
        this.cap = cap;
    }

    @Override
    public void push(int x) throws Exception  {
        if (top == cap) {
            throw new Exception("Stack Overflow");
        }
    }

    @Override
    public int pop() {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}


