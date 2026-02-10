package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String sayHello() {
        return "Hello from Service Layer!";
    }

    public String getMessage(String name) {
        return "Hello " + name + ", Welcome to Spring Boot!";
    }
}
