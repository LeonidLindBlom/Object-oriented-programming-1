package com.company;

public class PotentialEnergy {
    private static final double g = 9.806;
    private double h;
    private double m;

    public PotentialEnergy() {
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public static double FindEnergy(double h, double m){
        return m*g*h;
    }
}
