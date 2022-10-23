package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner paramScanner = new Scanner(System.in);
        PotentialEnergy energy1 = new PotentialEnergy();
        System.out.println("Введите высоту");
        energy1.setH(paramScanner.nextDouble());
        System.out.println("Введите массу тела");
        energy1.setM(paramScanner.nextDouble());
        System.out.println("Потенциальная энергия = " + PotentialEnergy.FindEnergy(energy1.getH(), energy1.getM()));
    }
}
