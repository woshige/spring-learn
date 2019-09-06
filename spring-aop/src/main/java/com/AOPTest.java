package com;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;

public class AOPTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        AnnotationAwareAspectJAutoProxyCreator c = new AnnotationAwareAspectJAutoProxyCreator();
        System.out.println(c.getClass().getName());

    }
}
