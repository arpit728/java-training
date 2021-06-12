package com.acecademy.stack;

import com.acecademy.exception.StackOverflowException;
import com.acecademy.exception.StackUnderflowException;

public class StackArrayImpl implements Stack {

    private int stack[];
    private int top;
    private int cap;

    public StackArrayImpl(int cap) {
        this.cap = cap;
        top = -1;
    }

    @Override
    public void push(int x) throws StackOverflowException {
        if (top == cap) {
            throw new StackOverflowException("Maximum capacity reached, cannot add more elements. Stack Overflow!!");
        }
    }

    @Override
    public int pop()throws StackUnderflowException {
        if (top == -1) {
            throw new StackUnderflowException("Cannot pop elements from empty stack");
        }
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}


