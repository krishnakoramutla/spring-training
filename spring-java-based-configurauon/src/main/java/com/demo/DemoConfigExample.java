package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfigExample {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfigExample.class);

        Greet gr = context.getBean(Greet.class);
        gr.greet("krishna");

    }

    @Bean
    public Greet greeterBean() {
        return new Greet();
    }

    public static class Greet {
        public void greet(String name) {
            System.out.println("Hello " + name + " !");
        }
    }
}
