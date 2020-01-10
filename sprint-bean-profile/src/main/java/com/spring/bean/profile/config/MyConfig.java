package com.spring.bean.profile.config;

import com.spring.bean.profile.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    @Bean
    public User user() {
        return new User();
    }
}
