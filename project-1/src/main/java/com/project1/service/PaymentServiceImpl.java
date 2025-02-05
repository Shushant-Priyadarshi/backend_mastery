package com.project1.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void makePayment(){
        System.out.println("Payment successful.....");
    }
}
