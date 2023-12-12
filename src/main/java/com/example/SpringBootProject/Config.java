package com.example.SpringBootProject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public CustomBean customBean(){
        return new CustomBean();

    }
}

