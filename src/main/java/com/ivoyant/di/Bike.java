package com.ivoyant.di;

public class Bike {
    private String name;
    private int cc;

    public Bike() {
    }

    public Bike(String name, int cc) {
        this.name = name;
        this.cc = cc;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
}
