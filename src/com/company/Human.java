package com.company;

public class Human {
    private String name;
    private String surname;
    private int birthYear;
    private static int currentYear = 2022;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public static int Age (int birthYear){
        return currentYear - birthYear;
    }
}
