package com.acecademy.new_features;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BinaryOperator;

public class LambdaExpressionDemo {
}


class Calculator {

    Map<Character, BinaryOperator<Integer>> operatorToFun = new HashMap<Character, BinaryOperator<Integer>>() {
        {
            put('+', (a, b) -> a + b);
            put('-', (a, b) -> a - b);
            put('*', (a, b) -> a * b);
            put('/', (a, b) -> a / b);
        }
    };

    int apply(char operator, int a, int b) {
        if (!operatorToFun.containsKey(operator)) throw new IllegalArgumentException("Not a valid operator");
        return operatorToFun.get(operator).apply(a, b);
    }

}

