package com.spring.bean.profile;

import com.spring.bean.profile.config.SpringConfig;
import com.spring.bean.profile.domain.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.refresh();
        context.getBean(MyBean.class);
    }
}
