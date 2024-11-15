package com.example.beanspractice.service;

public class GPay implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("GPay Payment processing");
    }
}
