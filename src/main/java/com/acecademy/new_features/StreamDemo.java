package com.acecademy.new_features;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) throws IOException {

        int a[] = new int[]{};
        int sum = Arrays.stream(a).sum();
        int min = Arrays.stream(a).min().orElse(Integer.MIN_VALUE);

        int max = Arrays.stream(a).max().orElse(Integer.MAX_VALUE);

        System.out.println(sum);
        System.out.println(min);
        System.out.println(max);


        List<Integer> nums = Arrays.asList(2, 3, 4, 5, 6, 7, 9, 1, 10);
        List<Integer> oddNums = nums.stream()
                .filter(x -> x % 2 == 1)
                .filter(x -> x > 10)
                .collect(Collectors.toList());


        List<String> numStr = Arrays.asList("2", "5", "123", "918", "3481");
        List<Integer> numsConverted = numStr.stream()
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toList());

        nums = Arrays.asList(1, 3, 5, 2);

        boolean allEven = nums.stream().allMatch(num -> num % 2 == 0);
        boolean anyEven = nums.stream().anyMatch(num -> num % 2 == 0);
        System.out.println(allEven);
        System.out.println(anyEven);


        List<Student> students = Arrays.asList(new Student("Alice"), new Student("John"), new Student("Bob"));

        List<String> collect = students.stream().map(Student::getName).collect(Collectors.toList());
        System.out.println(collect);


        List<String> cities = Arrays.asList("Mumbai", "Mumbai", "Delhi", "Kolkata", "Chennai", "Kolkata");
        System.out.println(cities);
        List<String> distCities = cities.stream().distinct().collect(Collectors.toList());
        System.out.println(distCities);

        System.out.println(cities.stream().distinct().count());


        cities.forEach(System.out::println);

        cities.stream().peek(System.out::println).count();

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

    }
}


class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

