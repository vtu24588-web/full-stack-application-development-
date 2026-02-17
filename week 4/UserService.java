package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired(required = false)
    private LoggingService loggingService;

    public String processUser() {

        if (loggingService != null) {
            loggingService.log("User processed successfully.");
        } else {
            System.out.println("LoggingService not available.");
        }

        return "User processing completed!";
    }
}
