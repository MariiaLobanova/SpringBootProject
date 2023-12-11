package com.example.SpringBootProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {

        @GetMapping("/hello")
        public String helloWorld() {
            return "Hello World!!! I am from Home controller!!";
        }
}