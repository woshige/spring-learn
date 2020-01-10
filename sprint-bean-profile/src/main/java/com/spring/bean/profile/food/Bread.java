package com.spring.bean.profile.food;

import org.springframework.stereotype.Component;

@Component
public class Bread implements Food {
    @Override
    public void eat() {
        System.out.println("Bread");
    }
}
