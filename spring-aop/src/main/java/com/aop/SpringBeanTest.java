package com.aop;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBeanTest implements BeanNameAware,BeanFactoryAware,ApplicationContextAware
,InitializingBean ,DisposableBean {
    private String beanName;

    public SpringBeanTest(){
        System.out.println("SpringBeanTest is initializing");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("set BeanName ...");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("set BeanFactory invoke");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("set ApplicationContext invoke");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet invoke");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy invoke");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("@PostConstruct");
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("@PreDestroy");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize invoke");
    }

    public String getBeanName() {
        return beanName;
    }
}
