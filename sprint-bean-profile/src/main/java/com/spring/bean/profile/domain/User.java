package com.spring.bean.profile.domain;

import com.spring.bean.profile.food.Food;
import org.springframework.beans.factory.annotation.Autowired;

public class User {
    private String name = "slc";
    private String password = "123";
    @Autowired
    private Food food;

    public Food getFood() {
        return food;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
