package com.ivoyant.di.nonstringmap;

import java.util.Map;

public class Students {
    private String name;
    private Map<Sem, Section> clsDetails;

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", clsDetails=" + clsDetails +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Sem, Section> getClsDetails() {
        return clsDetails;
    }

    public void setClsDetails(Map<Sem, Section> clsDetails) {
        this.clsDetails = clsDetails;
    }

    public Students() {
    }

    public Students(String name, Map<Sem, Section> clsDetails) {
        this.name = name;
        this.clsDetails = clsDetails;
    }
}
