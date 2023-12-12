package com.example.SpringBootProject;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Profile;

@Configuration

public class AppProperties {
    private final String password;

    public AppProperties(@Value("${myApp.password}")String password) {
        this.password = password;
    }

    @Bean
    @Profile("prod")
    String getProdEnviroment(){
        return "prod";
    }
    @Bean
    @Profile("dev")
    String getDevEnviroment(){
        return "dev";
    }


    @PostConstruct
    public void init(){
        System.out.println("password for enviroment is" + password);

    }
}
