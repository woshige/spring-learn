package com.spring.bean.profile.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 当另一个类中使用属性注入一个接口的时候，如果说一个接口的实现类有多个的话，会让spring容器抛出异常
 * 所以对待这种情况的时候，使用@Primary注解来指定那个对象是要被优先的进行创建的，就是首选的意思
 * 但是有种情况是首选的对象不止一个所以可以使用注解@Qualifier
 */
@Component
@Primary
public class Banana implements Food {
    @Override
    public void eat() {
        System.out.println("Banana");
    }
}
