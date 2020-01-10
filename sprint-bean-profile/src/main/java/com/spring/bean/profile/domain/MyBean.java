package com.spring.bean.profile.domain;

public class MyBean {
    private String name = "slc";
    private String password = "123";

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
