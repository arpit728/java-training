package com.acecademy.stack;

import com.acecademy.exception.StackOverflowException;
import com.acecademy.exception.StackUnderflowException;

public interface Stack {
    void push(int x) throws StackOverflowException;

    int pop() throws StackUnderflowException;

    int size();
}
