package com.acecademy.lombok;

import lombok.*;


@Builder
public class User {
    String id;
    String name;
    String email;
    String phone;
    String city;
    String gender;
    String country;
}
