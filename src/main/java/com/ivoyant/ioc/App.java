package com.ivoyant.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Traditional approach of creating objects
        Sim sim = new Airtel();
        Sim sim1 = new Jio();
        System.out.println("------Traditional Approach------");
        sim.sim_data();
        sim.calling();
        sim1.sim_data();
        sim1.calling();
        // If we got new sim vodafone then we need to change over here

        // IoC - Bean Factory
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("Iocconfig.xml");
        Sim sim2 = (Sim) beanFactory.getBean("airtel");
        System.out.println("------BeanFactory------");
        sim2.sim_data();
        sim2.calling();

        // IoC - ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("Iocconfig.xml");
        Sim sim3 = (Sim) context.getBean("jio");
        System.out.println("------ApplicationContext------");
        sim3.sim_data();
        sim3.calling();
    }
}
