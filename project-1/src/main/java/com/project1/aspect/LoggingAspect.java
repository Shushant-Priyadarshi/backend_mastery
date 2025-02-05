package com.project1.aspect;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* com.project1.service.PaymentServiceImpl.makePayment())")
    public void logBefore() {
        System.out.println("Payment is getting executed....");
    }

}
