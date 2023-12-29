package com.ivoyant.di.nonstringmap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("NonStringconfig.xml");
        Students student = context.getBean("Virat", Students.class);
        System.out.println(student);
        Students student1 = context.getBean("Rohit", Students.class);
        System.out.println(student1);
    }
}
