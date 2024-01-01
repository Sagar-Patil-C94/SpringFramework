package com.ivoyant.di.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Mapconfig.xml");
        // Dependency Injection - Used Constructor Arg
        Rider rider = context.getBean("Virat", Rider.class);
        System.out.println(rider.getRidderName());
        System.out.println(rider.getBike());
        // Dependency Injection - Used Setter Method
        Rider rider1 = context.getBean("Rohit", Rider.class);
        System.out.println(rider1.getRidderName());
        System.out.println(rider1.getBike());

    }
}
