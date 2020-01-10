package com.spring.bean.profile.domain;

public class User {
    private String name = "slc";
    private String password = "123";

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
