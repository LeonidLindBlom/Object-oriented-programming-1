package com.company;

public class RightTriangle {
    private double cathet1;
    private double cathet2;
    private double hypotenuse;

    public RightTriangle(double cathet1, double cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    public static double HypotenuseLength (double cathet1, double cathet2){
        return Math.sqrt(cathet1*cathet1+cathet2*cathet2);
    }
}
