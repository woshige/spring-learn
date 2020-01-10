package com.spring.bean.profile.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bread implements Food {
    @Override
    public void eat() {
        System.out.println("Bread");
    }
}
