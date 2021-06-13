package com.acecademy.collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparingDemo {
    public static void main(String[] args) throws IOException, InterruptedException {

        int a[][] = {
                {4, 7, 9},
                {2, 8, 1},
                {5, 12, 7}
        };

        List<StringWrapper> list = Arrays.asList(new StringWrapper("a"), new StringWrapper("alice"), new StringWrapper("bob"));
        Arrays.sort(a, Comparator.comparingInt(row -> row[0]));
        Arrays.sort(a, Comparator.comparing(ints -> ints[0]));
        System.out.println(Arrays.deepToString(a));

        list.sort(Comparator.comparing(s -> s.str));
        System.out.println(list);
    }


}

class StringWrapper {
    String str;

    @Override
    public String toString() {
        return "StringWrapper{" +
                "str='" + str + '\'' +
                '}';
    }

    public StringWrapper(String str) {
        this.str = str;
    }
}

