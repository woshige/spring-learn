package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SpringBeanLifStyle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("the name method");
        this.name = name;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanNameAware method");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware method");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("set method");
    }

    public void myInitMethod() {
        System.out.println("myInitMethod");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method");
    }
}
