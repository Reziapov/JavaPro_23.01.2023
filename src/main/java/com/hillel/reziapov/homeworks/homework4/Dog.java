package com.hillel.reziapov.homeworks.homework4;

public class Dog extends Animal {

    private static int counterDog = 0;

    public static int getCounterDog() {
        return counterDog;
    }

    public Dog(String name) {
        super(name);
        counterDog++;
    }

}
