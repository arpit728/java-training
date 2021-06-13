package com.acecademy.lombok;

public class LombokDemo {

    public static void main(String[] args) {
        User user = User.builder()
                .name("as")
                .gender("male")
                .email("abc.xyz")
                .build();


    }
}
