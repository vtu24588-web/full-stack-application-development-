package com.example.demo;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SMSNotificationService implements NotificationService {

    @Override
    public String sendNotification(String message) {
        return "SMS Sent: " + message;
    }
}
