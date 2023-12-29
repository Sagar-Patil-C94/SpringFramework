package com.ivoyant.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Dependency Injection - Used Constructor and Property configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("Diconfig.xml");
        Rider rider = context.getBean("Virat", Rider.class);
        System.out.println(rider.getRidderName());
        System.out.println(rider.getBike());
    }
}
