package com.spring.bean.profile.food;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 为了解决Bean的id与类名之间的紧耦合的关系，可以在类上使用@Qualifer注解来对Bean的id进行指定
 * 防止以后修改类名导致不能注入的问题
 */
@Component
@Primary
@Qualifier("bread")
public class Bread implements Food {
    @Override
    public void eat() {
        System.out.println("Bread");
    }
}
