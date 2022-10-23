package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner cathetScanner = new Scanner(System.in);
        System.out.println("Введите два катета");
        double cathet1 = cathetScanner.nextDouble();
        double cathet2 = cathetScanner.nextDouble();
        System.out.println("Гипотенуза: " + RightTriangle.HypotenuseLength(cathet1, cathet2));
    }
}
