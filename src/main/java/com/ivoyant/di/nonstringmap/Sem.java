package com.ivoyant.di.nonstringmap;

public class Sem {
    private int sem;

    @Override
    public String toString() {
        return "Sem{" +
                "sem=" + sem +
                '}';
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }

    public Sem() {
    }

    public Sem(int sem) {
        this.sem = sem;
    }
}
