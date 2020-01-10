package com.spring.bean.profile;

import com.spring.bean.profile.config.MyConfig;
import com.spring.bean.profile.domain.User;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = context.getBean(User.class);
        user.getFood().eat();
    }
}
