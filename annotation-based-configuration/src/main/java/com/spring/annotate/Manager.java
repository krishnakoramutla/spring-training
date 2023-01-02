package com.spring.annotate;

import org.springframework.stereotype.Component;

@Component
public class Manager implements  Employee{
    @Override
    public void doWork() {
        System.out.println("manage the Branch Operations");
    }
}
