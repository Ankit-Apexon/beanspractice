package com.example.beanspractice.service;

public class CreditCardService implements PaymentService{
    @Override
    public void processPayment(double amount) {
        System.out.println("Credit Card Payment Processing");
    }
}
