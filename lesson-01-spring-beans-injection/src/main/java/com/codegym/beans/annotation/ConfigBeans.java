package com.codegym.beans.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {

    @Bean
    public Developer fsDeveloper() {
        Developer developer = new Developer();
        developer.setId(3);
        developer.setName("tuan@gmail.com");
        developer.setMajor("FullStack");
        return developer;
    }
}
