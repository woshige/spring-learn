package com.aop;

import com.aop.SpringBeanTest;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof SpringBeanTest){
            System.out.println("SpringBeanTest.postProcessAfterInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof SpringBeanTest){
            System.out.println("SpringBeanTest.postProcessBeforeInitialization");
        }
        return bean;
    }
}
