package com.hillel.reziapov.homeworks.homework4;

public class Cat extends Animal {

    private static int counterCat = 0;

    public static int getCounterCat() {
        return counterCat;
    }

    public Cat(String name) {
        super(name);
        counterCat++;
    }

    public void swim() {
        System.out.println(getName() + " не вміє плавати");
    }

}
