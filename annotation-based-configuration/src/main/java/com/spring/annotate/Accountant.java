package com.spring.annotate;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements  Employee{
    @Override
    public void doWork() {
        System.out.println("audit the accounts..");
    }
}
