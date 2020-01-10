package com.spring.assembling;

import com.spring.assembling.disc.MyCompactDisc;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        MyCompactDisc bean = context.getBean(MyCompactDisc.class);
        System.out.println(bean);
    }
}
