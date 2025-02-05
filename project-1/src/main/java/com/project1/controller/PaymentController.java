package com.project1.controller;

import com.project1.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private  PaymentService paymentService;

    @GetMapping("/payment")
    public void payment(){
        paymentService.makePayment();
    }

}
