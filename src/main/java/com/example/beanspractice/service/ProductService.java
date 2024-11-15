package com.example.beanspractice.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public ProductService(){
        System.out.println("Product Service");
    }
}