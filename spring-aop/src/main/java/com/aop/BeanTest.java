package com.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCotext.xml");
        SpringBeanTest springBeanTest = (SpringBeanTest) context.getBean("beanTest");
        System.out.println("--------------------------- "+springBeanTest.getBeanName() + "----------------------");
        context.close();
    }
}
