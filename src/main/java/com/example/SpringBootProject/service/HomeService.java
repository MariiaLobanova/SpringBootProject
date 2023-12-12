package com.example.SpringBootProject.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Value("${app.greeting}")
    private String greeting;

    public String getGreeting() {
        return greeting;
    }
}
