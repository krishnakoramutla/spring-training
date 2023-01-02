package com.spring.annotate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BankApp {
    public static void main(String[] args) {

        ApplicationContext con = new ClassPathXmlApplicationContext("applicationcontext.xml");

        Employee e = (Employee) con.getBean("accountant");
        e.doWork();
    }
}
