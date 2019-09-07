package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import sun.java2d.pipe.SpanIterator;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean implements BeanNameAware, BeanFactoryAware,
        ApplicationContextAware,InitializingBean,DisposableBean {
    private String SpringBeanName;

    public SpringBean() {
        System.out.println("-----------SpringBeanInitializing-----------");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("------------setFactory----------------");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("----------setBeanName-----------------");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("----------------setApplicationContext----------------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("------------------------afterPropertiesSet---------------");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("-------------------destroy---------------------------");
    }

    public String getSpringBeanName() {
        return SpringBeanName;
    }

    public void setSpringBeanName(String springBeanName) {
        SpringBeanName = springBeanName;
        System.out.println("------------SpringBeanName has set--------------------");
    }
    public void myPostConstruct(){
        System.out.println("--------------myPostConstruct-----------");
    }
    @PostConstruct
    public void springPostConstruct(){
        System.out.println("----------------@PostConstruct-----------------");
    }
    public void myPrePostConstruct(){
        System.out.println("----------------------------myPrePostConstruct-----------------");
    }
    @PreDestroy
    public void springPreDestroy(){
        System.out.println("---------------------@PreDestroy-------------------");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("---------------------------finalize-----------------");
    }
}
