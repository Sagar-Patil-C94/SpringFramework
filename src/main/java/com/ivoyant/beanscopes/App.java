package com.ivoyant.beanscopes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("scopesconfig.xml");
        Student student = context.getBean("student", Student.class);
        student.setName("Virat");
        Student student1 = context.getBean("student", Student.class);
        if (Objects.equals(student1.getName(), "Virat")) {
            System.out.println("Singleton Bean - Refering to the same object!!!");
        }
        Employee employee = context.getBean("employee", Employee.class);
        employee.setName("Rohit");
        Employee employee1 = context.getBean("employee", Employee.class);
        if(employee.equals(employee1)){
            System.out.println("Singleton Bean - Refering to the same object!!!");
        }
        else {
            System.out.println("Prototype Bean - Not Refering to the same object!!!");
        }
    }
}
