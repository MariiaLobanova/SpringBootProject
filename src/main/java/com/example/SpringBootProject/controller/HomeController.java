package com.example.SpringBootProject.controller;

import com.example.SpringBootProject.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

    private final HomeService homeService;

    @Autowired
    public HomeController(HomeService homeService) {
        this.homeService = homeService;
    }

    @GetMapping("/hello")
        public String helloWorld() {

        String greeting = homeService.getGreeting();
        return greeting;
        }


}