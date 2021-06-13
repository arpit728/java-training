package com.acecademy.stack;

import com.acecademy.exception.StackUnderflowException;

public class StackUser {

    public static void main(String[] args) {
        Stack s = new StackArrayImpl(10);
        try {
            s.pop();
        } catch (StackUnderflowException e) {
            e.printStackTrace();
        }
    }
}
