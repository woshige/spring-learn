package com.spring.bean.profile.config;

import com.spring.bean.profile.condition.MyCondition;
import com.spring.bean.profile.domain.MyBean;
import org.springframework.context.annotation.*;

@Configuration
public class SpringConfig {
    @Bean
    @Profile("dev")
    public String dev(){
        return "dev profile";
    }
    @Bean
    @Profile("test")
    public String test(){
        return "test profile";
    }
    @Bean
    @Profile("prod")
    public String prod(){
        return "dev profile";
    }
    @Bean
    @Conditional(MyCondition.class)
    public MyBean myBean(){
        return new MyBean();
    }
}
