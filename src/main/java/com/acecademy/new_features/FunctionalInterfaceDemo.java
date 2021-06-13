package com.acecademy.new_features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaceDemo {

    public static void main(String[] args) {
/*        IntPredicate oddPredicate = x -> x % 2 == 1;
        IntPredicate numGreaterThan10 = x -> x > 10;

        System.out.println(oddPredicate.and(numGreaterThan10).test(15));
        System.out.println(oddPredicate.and(numGreaterThan10).test(12));
        System.out.println(oddPredicate.and(numGreaterThan10).test(6));
        System.out.println(oddPredicate.and(numGreaterThan10).test(7));

        System.out.println(oddPredicate.test(5));
        System.out.println(oddPredicate.test(8));
        System.out.println(oddPredicate.test(3));

        Function<String, Integer> stringToInt = Integer::parseInt;

        Integer integer = stringToInt.apply("123");

        System.out.println(integer);

        String s[] = new String[]{"2132", "123", "80"};

        System.out.println(transformer(s, stringToInt));
*/

        BiFunction<Integer, Integer, Float> eq = (x, y) -> 2F * x + y;
        System.out.println(eq.apply(3, 4));

        IntUnaryOperator uni = x -> x * x;
        System.out.println(uni.applyAsInt(2));


        BinaryOperator<Integer> add = Integer::sum;
        System.out.println(add.apply(2, 3));

    }


    static List<Integer> transformer(String s[], Function<String, Integer> function) {
        List<Integer> list = new ArrayList<>();
        for (String s1 : s) {
            list.add(function.apply(s1));
        }
        return list;
    }
}
