package com.ivoyant.ioc;

public class Jio implements Sim {

    @Override
    public void calling() {
        System.out.println("Jio Calling!!!");
    }

    @Override
    public void sim_data() {
        System.out.println("Jio Data!!!");
    }
}
