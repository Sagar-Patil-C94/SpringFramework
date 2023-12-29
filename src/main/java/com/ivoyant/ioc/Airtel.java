package com.ivoyant.ioc;

public class Airtel implements Sim {

    @Override
    public void calling() {
        System.out.println("Airtel Calling!!!");
    }

    @Override
    public void sim_data() {
        System.out.println("Airtel Data!!!");
    }
}
