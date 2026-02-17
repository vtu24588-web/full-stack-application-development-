package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class LoggingService {

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
