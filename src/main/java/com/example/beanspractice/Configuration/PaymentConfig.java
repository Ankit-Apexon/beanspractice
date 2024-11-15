package com.example.beanspractice.Configuration;

import com.example.beanspractice.service.CreditCardService;
import com.example.beanspractice.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentService creditCardPaymentService(){
        return new CreditCardService();
    }
    @Bean
    public PaymentService gpayPaymentService(){
        return new CreditCardService();
    }
}
