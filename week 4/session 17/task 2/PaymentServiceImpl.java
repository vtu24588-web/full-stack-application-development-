
package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public String processPayment(double amount) {
        return "Payment of Rs." + amount + " processed successfully!";
    }
}
