package com.spring.bean.profile.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        System.out.println(registry.getBeanDefinitionNames().toString());
        Environment environment = conditionContext.getEnvironment();
        System.out.println(environment.getProperty("os.name"));
        ClassLoader classLoader = conditionContext.getClassLoader();
        System.out.println(classLoader);
        return false;
    }
}
