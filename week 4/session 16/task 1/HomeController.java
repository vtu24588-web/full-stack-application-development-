package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome to Spring Boot Servlet Application!";
    }

    @GetMapping("/test")
    public String test() {
        return "Servlet container is working properly!";
    }
}
