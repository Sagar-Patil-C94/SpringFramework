package com.ivoyant.di.map;

import java.util.Map;

public class Bike {
    private String name;
    private Map<String, String> bikeDetails;

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", bikeDetails=" + bikeDetails +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getBikeDetails() {
        return bikeDetails;
    }

    public void setBikeDetails(Map<String, String> bikeDetails) {
        this.bikeDetails = bikeDetails;
    }

    public Bike() {
    }

    public Bike(String name, Map<String, String> bikeDetails) {
        this.name = name;
        this.bikeDetails = bikeDetails;
    }
}
