package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class WithoutCGLIB {
    private int counter;

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(WithoutCGLIB.class);

        WithoutCGLIB con = context.getBean(WithoutCGLIB.class);
        System.out.println(con.doSomething());
        System.out.println(con.doSomething());
    }

    public String doSomething() {
        System.out.println("method invoked ");
        return String.valueOf(++counter);
    }
}
