package com.ivoyant.di;

public class Rider {
    private Bike bike;
    private String ridderName;

    public Rider(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String toString() {
        return "Rider{" +
                "bike=" + bike +
                ", ridderName='" + ridderName + '\'' +
                '}';
    }

    public Bike getBike() {
        return bike;
    }

    public void setBike(Bike bike) {
        this.bike = bike;
    }

    public String getRidderName() {
        return ridderName;
    }

    public void setRidderName(String ridderName) {
        this.ridderName = ridderName;
    }

    public Rider(Bike bike, String ridderName) {
        this.bike = bike;
        this.ridderName = ridderName;
    }
}
