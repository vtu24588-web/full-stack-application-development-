package com.example.demo;

import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailNotificationService implements NotificationService {

    @Override
    public String sendNotification(String message) {
        return "Email Sent: " + message;
    }
}
