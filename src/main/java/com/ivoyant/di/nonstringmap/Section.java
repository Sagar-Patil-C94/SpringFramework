package com.ivoyant.di.nonstringmap;

public class Section {
    private String section;

    @Override
    public String toString() {
        return "Section{" +
                "section='" + section + '\'' +
                '}';
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Section() {
    }

    public Section(String section) {
        this.section = section;
    }
}
