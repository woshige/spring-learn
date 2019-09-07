package life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof SpringBean){
            System.out.println("---------------SpringBean--postProcessBeforeInitialization-------------");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof SpringBean){
            System.out.println("---------------SpringBean--postProcessAfterInitialization-------------");
        }
        return bean;
    }
}
