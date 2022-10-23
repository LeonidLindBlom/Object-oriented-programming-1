package com.company;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setBirthYear(2002);
        human1.setName("Рей");
        human1.setSurname("Аянами");
        System.out.println(human1.getName() +" "+ human1.getSurname() +", Возраст: "+ Human.Age(human1.getBirthYear()));
    }
}
