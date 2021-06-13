package com.acecademy.exception;

public class ExceptionBasic {


    public static void main(String[] args) {
        int res = divide(6, 3);
        System.out.println(res);

        res = divide(10, 5);
        System.out.println(res);

        try {
            res = test();
            System.out.println(res);
        } catch (ArithmeticException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        } catch (RuntimeException rte) {
            System.out.println("Inside Runtime exception");
        } catch (Exception e) {
            System.out.println("Inside generic exception");
        }

        System.out.println("Code execution completed");
        System.out.println("Code execution completed1");
        System.out.println("Code execution completed2");
        System.out.println("Code execution completed3");
    }

    static int test() {
        throw new IllegalArgumentException();
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
