package com.aop;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;

public class PostConstructTest implements InitializingBean {
    public PostConstructTest(){
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("----------afterPropertiesSet-----------");
    }
    @PostConstruct
    public void method(){
        System.out.println("------------postConstruct-----------");
    }
    public void initMethod(){
        System.out.println("--------------initMethod------------");
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationCotext.xml");
        PostConstructTest constructTest = (PostConstructTest)context.getBean("constructTest");
    }
}
