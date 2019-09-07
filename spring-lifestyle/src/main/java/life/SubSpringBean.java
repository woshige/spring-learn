package life;

import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;

public class SubSpringBean extends SpringBean implements
        BeanClassLoaderAware,EnvironmentAware,EmbeddedValueResolverAware,ResourceLoaderAware
,ApplicationEventPublisherAware,MessageSourceAware {
    private String subSpringBeanName;
    public void setSubSpringBeanName(String subSpringBeanName){
        System.out.println("设置setSubSpringBeanName属性");
        this.subSpringBeanName = subSpringBeanName;
    }
    public String getSubSpringBeanName(){
        return this.subSpringBeanName;
    }
    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("----------------setBeanClassLoader------------");
    }

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("--------------setEnvironment-----------------");
    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver stringValueResolver) {
        System.out.println("----------------setEmbeddedValueResolver---------------");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("-----------------setResourceLoader--------------------");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        System.out.println("-------------------setApplicationEventPublisher------------------");
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println("-------------------setMessageSource--------------------");
    }
}
