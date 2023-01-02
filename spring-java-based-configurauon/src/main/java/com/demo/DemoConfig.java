package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
    private int counter;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoConfig con = context.getBean(DemoConfig.class);
        System.out.println(con.doSomething());
        System.out.println(con.doSomething());
    }

    @Bean
    public String doSomething() {
        System.out.println("method invoked ");
        return String.valueOf(++counter);
    }
}
